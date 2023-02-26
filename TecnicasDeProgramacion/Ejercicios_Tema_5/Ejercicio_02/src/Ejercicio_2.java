import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> tabla = new ArrayList<Integer>();
        int num = 0;
        do{
            System.out.println("Introduce un número entre 0 y 9, o -1 para terminar");
            num = sc.nextInt();
            if(num >= 0 && num <= 9){
                tabla.add(num);
            }
        }while(num != -1);
        for(int i = 0; i < 10; i++){
            int contador = 0;
            for(int j = 0; j < tabla.size(); j++){
                if(tabla.get(j) == i){
                    contador++;
                }
            }
            System.out.println("El número " + i + " se ha escrito " + contador + " veces");
        }
    }

}
