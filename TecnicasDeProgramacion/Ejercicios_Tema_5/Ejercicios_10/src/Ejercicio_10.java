public class Ejercicio_10 {
    public static void main(String[] args) {
        //Probando el programa
        TablaEmpleados tabla = new TablaEmpleados();
        //Inserto 100 empleados
        for(int i = 0; i < 100; i++) {
            tabla.insertar(new Empleado(i));
        }
        //Busco algunos de los empleados insertados
        System.out.println(tabla.buscar(1));
        System.out.println(tabla.buscar(17));
        System.out.println(tabla.buscar(40));
    }
}
