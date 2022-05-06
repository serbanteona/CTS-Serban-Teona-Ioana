package clase;

public abstract class MijlocTransportHandler {
    MijlocTransportHandler mijlocTransportUrmator;
    protected int pragSuperior;

    public MijlocTransportHandler(int pragSuperior) {
        this.mijlocTransportUrmator=null;
        this.pragSuperior=pragSuperior;
    }

    public MijlocTransportHandler getMijlocTransportUrmator() {
        return mijlocTransportUrmator;
    }

    public void setMijlocTransportUrmator(MijlocTransportHandler mijlocTransportUrmator) {
        this.mijlocTransportUrmator = mijlocTransportUrmator;
    }
  public  abstract void recomandaMijlocTransport(double distanta);
}
