import java.util.Scanner;

public class Main {
    //Scanner para main
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean bucle = true;
        inicioSesion();

        //Bucle de menu
        while (bucle){
            bucle = menu();
        }

    }

    //Comprueba el usuario y la contraseña
    private static boolean inicioSesion (){
        do{
            System.out.println("Introduce tu usuario: ");
        }while(!Empleado.comprobarUser(sc.nextLine()));

        do{
            System.out.println("Introduce tu contraseña: ");
        }while(!Empleado.comprobarContrasenya(sc.nextLine()));

        return true;
    }

    //Menu
    public static boolean menu(){
        System.out.println("\n1 - Añadir ciudad   \n2 - Añadir obra de arte \n3 - Buscar ciudad \n4 - Buscar obra de arte \n5 - Listar ciudades " +
                "\n6 - Listar obras de arte \n0 - Salir");
        try {
            switch (sc.next()) {
                case "1":
                    Administracion.anyadirCiudad();
                    break;
                case "2":
                    Administracion.anyadirObra();
                    break;
                case "3":
                    Administracion.buscarCiudad();
                    break;
                case "4":
                    Administracion.buscarObra();
                    break;
                case "5":
                    Administracion.listarCiudades();
                    break;
                case "6":
                    Administracion.listarObras();
                    break;
                case "0":
                    return false;
                default:
                    System.out.println("No has introducido un parametro valido");

            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("No has introducido un numero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
}