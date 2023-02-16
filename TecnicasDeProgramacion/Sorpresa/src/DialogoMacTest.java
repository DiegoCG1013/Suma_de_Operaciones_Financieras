import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DialogoMacTest extends DialogoMac {

    @Test
    void testConversar() {
        DialogoMac dialogoMac = new DialogoMac();
        dialogoMac.conversar();
    }
}