import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractFactoryTest extends DialogoMac {

    @Test
    void generaDialogo() {
        FabricaDialogoMac fabricaDialogoMac = new FabricaDialogoMac();
        DialogoMac dialogoMac = new DialogoMac();
        assertEquals(dialogoMac, fabricaDialogoMac.generaDialogo());
    }
}