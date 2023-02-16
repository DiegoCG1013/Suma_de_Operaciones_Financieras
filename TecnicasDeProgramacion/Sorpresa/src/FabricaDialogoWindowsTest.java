import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaDialogoWindowsTest extends DialogoMac {

    @Test
    void generaDialogo() {
        FabricaDialogoWindows fabricaDialogoWindows = new FabricaDialogoWindows();
        assertEquals("Hola, soy un dialogo de Windows", fabricaDialogoWindows.generaDialogo().conversar());
    }
}