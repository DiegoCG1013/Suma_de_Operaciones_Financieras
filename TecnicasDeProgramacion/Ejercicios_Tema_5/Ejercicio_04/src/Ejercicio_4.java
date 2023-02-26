import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] votos = {0, 0, 0, 0};
        int voto = 0;
        do {
            try {
                System.out.println("Bienvenido a la mesa de votación, elija entre los siguientes candidatos: \n1. Candidato 1 \n2. Candidato 2 \n3. Candidato 3 \n4. Candidato 4");
                voto = sc.nextInt();
                if(voto != 68753421) {
                    switch (voto) {
                        case 1:
                            votos[0]++;
                            break;
                        case 2:
                            votos[1]++;
                            break;
                        case 3:
                            votos[2]++;
                            break;
                        case 4:
                            votos[3]++;
                            break;
                        default:
                            System.out.println("Error, el valor introducido no es válido");
                            break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, el valor introducido no es válido");
                sc.next();
            }
        } while (voto != 68753421);
        int sumaVotos = votos[0] + votos[1] + votos[2] + votos[3];
        System.out.println("Los resultados de la votación son: \nCandidato 1: " + (double)votos[0]/(double)sumaVotos*100 + "% \nCandidato 2: " + (double)votos[1]/(double)sumaVotos*100 + "% \nCandidato 3: " + (double)votos[2]/(double)sumaVotos*100 + "% \nCandidato 4: " + (double)votos[3]/(double)sumaVotos*100 + "%");
    }
}
