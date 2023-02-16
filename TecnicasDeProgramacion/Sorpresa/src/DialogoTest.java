import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DialogoTest extends DialogoMac {

    @Test
    void testConversar() {
        DialogoMac dialogoMac = new DialogoMac();
        dialogoMac.conversar();
    }
}