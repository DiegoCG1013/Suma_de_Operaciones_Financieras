import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DialogoWindowsTest extends DialogoMac {

    @Test
    void testConversar() {
        DialogoWindows dialogoWindows = new DialogoWindows();
        assertEquals("Hola, soy un dialogo de Windows", dialogoWindows.conversar());
    }
}