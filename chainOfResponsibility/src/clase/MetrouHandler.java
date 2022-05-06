package clase;

public class MetrouHandler extends MijlocTransportHandler{
    public MetrouHandler(int pragSuperior) {
        super(pragSuperior);
    }

    @Override
  public  void recomandaMijlocTransport(double distanta) {
        if(distanta<pragSuperior) {
            System.out.println("Se recomanda folosirea metroului pentru distanta de " + distanta);
        }else{
            super.getMijlocTransportUrmator().recomandaMijlocTransport(distanta);
        }
    }
}
