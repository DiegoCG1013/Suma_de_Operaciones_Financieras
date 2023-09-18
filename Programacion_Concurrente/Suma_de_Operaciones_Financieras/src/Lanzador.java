import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class Lanzador {
    public static void main(String[] args) {
        iniciarProcesamiento(args);
    }

    public static void iniciarProcesamiento(String[] archivos) {
        // Verificar que se proporcionen los nombres de los archivos como argumentos
        if (archivos.length == 0) {
            System.out.println("Debe proporcionar nombres de archivos como argumentos.");
            return;
        }

        ExecutorService executor = Executors.newFixedThreadPool(archivos.length);

        for (String archivo : archivos) {
            Runnable procesador = new ProcesadorContabilidad(archivo);
            executor.execute(procesador);
        }

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.HOURS);
            generarResultadoGlobal(archivos);
        } catch (InterruptedException e) {
            System.err.println("Error al esperar la finalización de los hilos: " + e.getMessage());
        }
    }

    public static void generarResultadoGlobal(String[] archivos) {
        AtomicLong resultadoGlobal = new AtomicLong(0);

        for (String archivo : archivos) {
            try {
                long sumaDepartamento = UtilidadesFicheros.sumarTransaccionesArchivo(archivo + ".res");
                resultadoGlobal.addAndGet(sumaDepartamento);
                System.out.println("Resultado para " + archivo + ": " + sumaDepartamento);
            } catch (IOException e) {
                System.err.println("Error al leer el archivo de resultado de " + archivo + ": " + e.getMessage());
            } catch (Exception E){
                System.out.println("Formato de los numeros erroneo en " + archivo + ", no se modificara el archivo de resultados");
            }
        }

        try {
            UtilidadesFicheros.guardarResultado("Resultado_global", resultadoGlobal.get());
            System.out.println("Resultado global: " + resultadoGlobal.get());
        } catch (IOException e) {
            System.err.println("Error al guardar el resultado global: " + e.getMessage());
        }
    }
}
