public class FabricaDialogoWindows extends AbstractFactory{
    public Dialogo generaDialogo (){
        return new DialogoWindows();
    }
}
