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
        double tarifa, primaFamiliar, salarioBruto, salarioNeto, contribucionDeudaSocial, contribucionContingencias, seguroMedico, fondoPensiones, seguroDesempleo, pensionComplementaria, contribucionJubilacion, deduccionesTotales;

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

            salarioBruto = (salarioBruto(horas, tarifa));
            contribucionDeudaSocial = salarioBruto * 0.0349;
            contribucionContingencias = salarioBruto * 0.0615;
            seguroMedico = salarioBruto * 0.0095;
            fondoPensiones = salarioBruto * 0.0844;
            seguroDesempleo = salarioBruto * 0.0305;
            pensionComplementaria = salarioBruto * 0.0381;
            contribucionJubilacion = salarioBruto * 0.0102;
            deduccionesTotales = contribucionDeudaSocial + contribucionContingencias + seguroMedico + fondoPensiones + seguroDesempleo + pensionComplementaria + contribucionJubilacion;
            salarioNeto = salarioBruto - deduccionesTotales;
            primaFamiliar = primaFamiliar(hijos);

            System.out.println("Nómina de " + nombre + " " + apellido + "\nEstado: " + puesto + "\nSalario bruto: "
                    + salarioBruto + "€" + "\n\tDeducciones: " + "\nContribución para el pago de la deuda social y contingencias comunes imponible: "
                    + contribucionDeudaSocial + "€" + "\nContribución de contingencias comunes no imponible: " + contribucionContingencias + "€"
                    + "\nSeguro médico: " + seguroMedico + "€" + "\nFondo de pensiones: " + fondoPensiones + "€" + "\nSeguro de desempleo: "
                    + seguroDesempleo + "€" + "\nPensión complementaria (Entidad privada): " + pensionComplementaria + "€" +
                    "\nContribución de jubilación anticipada: " + contribucionJubilacion + "€" + "\nDeducciones totales de los empleados: "
                    + deduccionesTotales + "€" + "\nSalario neto: " + salarioNeto + "€" + "\nPrima familiar: " + primaFamiliar + "€" +
                    "\nSalario neto a pagar: " + (primaFamiliar + salarioNeto) + "€");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static double salarioBruto(int horas, double tarifa) {
        double  salarioBruto = 0;
        if (horas < 169) {
            salarioBruto = horas * tarifa;
        } else if (horas >= 169 && horas <= 180) {
            salarioBruto = (horas - 169) * (tarifa * 1.5) + 169 * tarifa;
        } else if (horas > 180) {
            salarioBruto = (horas - 180) * (tarifa * 1.6) + 11 * (tarifa * 1.5) + 169 * tarifa;
        }
        return salarioBruto;
    }
    static double primaFamiliar(int hijos) {
        double primaFamiliar = 0;
        if (hijos == 1) {
            primaFamiliar = 20;
        } else if (hijos == 2) {
            primaFamiliar = 50;
        } else if (hijos > 2) {
            primaFamiliar = 70 + (hijos - 2) * 20;
        }
        return primaFamiliar;
    }
}
