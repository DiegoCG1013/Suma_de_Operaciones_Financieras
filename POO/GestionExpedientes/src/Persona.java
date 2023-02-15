public class Persona {

    private String dni, nombre, direccion;
    private static final char LETRAS[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    Persona (){}

    public Persona(String dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {

        //Quito el guion y paso minusculas a mayusculas
        dni = dni.replace("-", "").toUpperCase();
        if (comprobarDni(dni)) {
            this.dni = dni;
        }else {
            System.out.println("Formato de DNI no valido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private static boolean comprobarDni (String dni) {
        if (dni.length() == 9) {

            String num = (dni.substring(0, 8));
            int numero = 0;
            try {
                numero = Integer.parseInt(num);
            } catch (Exception e) {
                System.out.println("Error en el numero del DNI");
                return false;
            }
            if (LETRAS[numero % 23] == dni.charAt(8)) return true;
        }
        return false;
    }
}
