package clase;

public class AutobuzHandler extends MijlocTransportHandler{
    @Override
  public void recomandaMijlocTransport(double distanta) {
        if(distanta <5){
            System.out.println("Se recomanda folosirea autobuzului pentru distanta "+distanta);
        }else{
            super.getMijlocTransportUrmator().recomandaMijlocTransport(distanta);
        }
    }
}
