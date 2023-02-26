public class Ejercicio_1 {

    public static void main(String[] args) {
        int[] tabla = new int[9];
        int pos = 0;
        for(int i = 9; i > 0; i--, pos++){
            tabla[pos] = i;
        }
        for(int i = 0; i < tabla.length; i++){
            System.out.println(tabla[i]);
        }
    }
}
