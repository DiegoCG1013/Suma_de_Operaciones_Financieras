import java.io.IOException;

public class ProcesadorContabilidad implements Runnable {
    private String nombreArchivo;

    public ProcesadorContabilidad(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void run() {
        try {
            long suma = UtilidadesFicheros.sumarTransaccionesArchivo(nombreArchivo);
            UtilidadesFicheros.guardarResultado(nombreArchivo, suma);
        } catch (IOException e) {
            System.err.println("Error al procesar el archivo " + nombreArchivo + ": " + e.getMessage());
        } catch (Exception E){
            System.out.println("Formato de los numeros erroneo en " + nombreArchivo + ", no se modificara el archivo de resultados");
        }
    }
}
