public class FabricaDialogoMac extends AbstractFactory {
    public Dialogo generaDialogo (){
        return new DialogoMac();
    }
}