import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FabricaDialogoWindows fabricaDialogoWindows = new FabricaDialogoWindows();
        FabricaDialogoMac fabricaDialogoMac = new FabricaDialogoMac();

        boolean x = true;
        while (x) {
            System.out.println("1. Windows");
            System.out.println("2. Mac");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    Dialogo dialogoWindows = fabricaDialogoWindows.generaDialogo();
                    dialogoWindows.conversar();
                    break;
                case "2":
                    Dialogo dialogoMac = fabricaDialogoMac.generaDialogo();
                    dialogoMac.conversar();
                    break;
                case "3":
                    x = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
