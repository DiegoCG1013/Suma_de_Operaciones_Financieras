import java.util.Scanner;

public class Ejercicio_4 {
    //Enunciado: Sabiendo que:
    //
    //Para cocinar 500 gramos de carne de vacuno, se necesita:
    //
    //10 minutos si quieres una cocción casi cruda
    //
    //17 minutos si quieres una cocción al punto
    //
    //25 minutos si quieres una cocción bien hecha
    //
    //Para cocinar 400 gramos de cordero se necesita:
    //
    //15 minutos si quieres una cocción casi cruda
    //
    //25 minutos si quieres una cocción al punto
    //
    //40 minutos si quieres una cocción bien hecha
    //
    //El tiempo de cocción es proporcional al peso.
    //
    //Dependiendo de la información introducida por el usuario (tipo de carne, modo de cocción y peso), mostrar el tiempo de cocción de una carne en segundos.

    static final double vacunoCasiCrudo = 500.0/(10.0*60.0);
    static final double vacunoAlPunto = 500.0/(17.0*60.0);
    static final double vacunoBienHecha = 500.0/(25.0*60.0);
    static final double corderoCasiCrudo = 400.0/(15.0*60.0);
    static final double corderoAlPunto = 400.0/(25.0*60.0);
    static final double corderoBienHecha = 400.0/(40.0*60.0);

    static final String[] tipoCarne = {"Vacuno", "Cordero"};
    static final String[] modoCoccion = {"Casi crudo", "Al punto", "Bien hecha"};
    static final double[] tiemposPorGramoVacuno = {500/(10*60), vacunoAlPunto, vacunoBienHecha};
    static final double[] tiemposPorGramoCordero = {corderoCasiCrudo, corderoAlPunto, corderoBienHecha};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipoCarne;
        int modoCoccion;
        String modoCoccionString;
        int peso;
        String pesoString;

        try {
            System.out.println("Introduce el tipo de carne: \n1. Vacuno\n2. Cordero ");
            tipoCarne = sc.nextLine();
            if (!tipoCarne.equals("1") && !tipoCarne.equals("2")) throw new Exception("Tipo de carne no válido");
            System.out.println("Introduce el modo de cocción: \n1. Casi crudo\n2. Al punto\n3. Bien hecha");
            modoCoccionString = sc.nextLine();
            modoCoccion = Integer.parseInt(modoCoccionString);
            if (modoCoccion < 1 || modoCoccion > 3) throw new Exception("Modo de cocción no válido");
            System.out.println("Introduce el peso (Gramos): ");
            pesoString = sc.nextLine();
            peso = Integer.parseInt(pesoString);
            if (peso <= 0) throw new Exception("Peso no válido");

            if (tipoCarne.equals("1")) {
                System.out.println("El tiempo de cocción es de " + peso*tiemposPorGramoVacuno[modoCoccion-1] + " segundos");
            } else {
                System.out.println("El tiempo de cocción es de " + peso*tiemposPorGramoCordero[modoCoccion-1] + " segundos");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
