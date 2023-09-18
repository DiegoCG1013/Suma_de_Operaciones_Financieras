import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

public class UtilidadesFicheros {
    public static long sumarTransaccionesArchivo(String nombreArchivo) throws IOException {
        long suma = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                suma += Long.parseLong(linea);
            }
        }
        return suma;
    }

    public static void guardarResultado(String nombreArchivo, long resultado) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo + ".res"))) {
            bw.write(String.valueOf(resultado));
        }
    }
}
