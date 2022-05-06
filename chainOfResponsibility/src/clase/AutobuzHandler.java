package clase;

public class AutobuzHandler extends MijlocTransportHandler{
    public AutobuzHandler(int pragSuperior) {
        super(pragSuperior);
    }

    @Override
  public void recomandaMijlocTransport(double distanta) {
        if(distanta <super.pragSuperior){
            System.out.println("Se recomanda folosirea autobuzului pentru distanta "+distanta);
        }else{
            super.getMijlocTransportUrmator().recomandaMijlocTransport(distanta);
        }
    }
}
