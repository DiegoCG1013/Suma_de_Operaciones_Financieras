import java.util.Scanner;

public class Ejercicio_5 {
    //Enunciado: Mostrar la nómina simplificada de un empleado a partir de la información introducida. El salario bruto depende de la cantidad de horas trabajadas y su tarifa por hora:
    //
    //Las horas inferiores a 169 horas se pagan aplicando su tarifa horaria.
    //
    //Las horas comprendidas entre 169 y 180 horas se pagan aplicando un incremento del 50 % sobre su tarifa horaria.
    //
    //Las horas superiores a 180 horas se pagan aplicando un incremento del 60 %.
    //
    //La prima familiar se calcula de la siguiente manera:
    //
    //1 hijo: 20 €
    //
    //2 hijos: 50 €
    //
    //Por encima de 2 hijos : 70 € +20 € por cada hijo adicional
    //
    //A continuación se muestra un ejemplo de posibles visualizaciones y entradas durante una ejecución del algoritmo (los valores introducidos por el usuario están escritos en negrita y cursiva):
    //
    //¿Apellido de la persona?
    //
    //Camino
    //
    //¿Nombre de la persona?
    //
    //Gerardo
    //
    //¿Puesto?
    //
    //1 - Agente de servicio
    //
    //2 - Empleado de oficina
    //
    //3 - Directivo
    //
    //1
    //
    //Número de horas trabajadas
    //
    //190
    //
    //¿Tarifa horaria?
    //
    //9,76
    //
    //¿Número de hijos?
    //
    //4
    //
    //Nómina de Gerardo Camino
    //
    //Estado : Agente de servicio
    //
    //Salario bruto: 1.966,64 € (169 horas sin incremento, 11 horas con incremento del 50 %, 10 horas con incremento del 60 %)
    //
    //Cálculo de deducciones:
    //
    //Contribución para el pago de la deuda social y contingencias comunes imponible
    //
    //1.966,64 € × 3,49 % = 68,64 €
    //
    //Contribución de contingencias comunes no imponible
    //
    //1.966,64 € × 6,15 % = 120,95 €
    //
    //Seguro médico
    //
    //1.966,64 € × 0,95 % = 18,68 €
    //
    //Fondo de pensiones
    //
    //1.966,64 € × 8,44 % = 165,98 €
    //
    //Seguro de desempleo
    //
    //1.966,64 € × 3,05 % = 59,98 €
    //
    //Pensión complementaria (Entidad privada)
    //
    //1.966,64 € × 3,81 % = 74,93 €
    //
    //Contribución de jubilación anticipada
    //
    //1.966,64 € × 1,02 % = 20,06 €
    //
    //Deducciones totales de los empleados: 529,22 €
    //
    //Salario neto: 1.437,42 €
    //
    //Prima familiar: 110 €
    //
    //Salario neto a pagar: 1.547,42 €

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, puesto;
        int horas, hijos;
        double tarifa, salarioBruto, salarioNeto, primaFamiliar, deducciones;

        try {
            System.out.println("¿Apellido de la persona?");
            apellido = sc.nextLine();
            System.out.println("¿Nombre de la persona?");
            nombre = sc.nextLine();
            System.out.println("¿Puesto?");
            puesto = sc.nextLine();
            System.out.println("Número de horas trabajadas");
            horas = sc.nextInt();
            System.out.println("¿Tarifa horaria?");
            tarifa = sc.nextDouble();
            System.out.println("¿Número de hijos?");
            hijos = sc.nextInt();





        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
