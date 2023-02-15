public class Main {
    static int x = 0;
    public static void main(String[] args) {
        primos(1);
    }
    public static void primos (int num){
        boolean comprobador = true;
        for(int i = 2; i<(num/2)+1 && comprobador; i++){
            if (num%i == 0) {
                comprobador = false;
            }
        }
        if(comprobador) System.out.println(num);;

        if (x < 100) {
            x++;
            primos(num+1);
        }
    }
}
