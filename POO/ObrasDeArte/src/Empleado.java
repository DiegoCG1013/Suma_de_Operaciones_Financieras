public class Empleado {
    //Atributos
    private static final String usuario = "user1", contrasenya = "admin1234";

    //Metodos estaticos para comprobar usuario y contraseña
    public static boolean comprobarUser (String usuariop){
        if(usuario.equals(usuariop)){
            return true;
        }else {
            System.out.println("Usuario incorrecto");
            return false;
        }
    }
    public static boolean comprobarContrasenya (String contrasenyap){
        if(contrasenya.equals(contrasenyap)){
            return true;
        }else {
            System.out.println("Contraseña incorrecta");
            return false;
        }
    }
}
