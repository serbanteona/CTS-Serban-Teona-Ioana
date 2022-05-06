package clase;

public abstract class MijlocTransportHandler {
    MijlocTransportHandler mijlocTransportUrmator;

    public MijlocTransportHandler() {
        this.mijlocTransportUrmator=null;
    }

    public MijlocTransportHandler getMijlocTransportUrmator() {
        return mijlocTransportUrmator;
    }

    public void setMijlocTransportUrmator(MijlocTransportHandler mijlocTransportUrmator) {
        this.mijlocTransportUrmator = mijlocTransportUrmator;
    }
  public  abstract void recomandaMijlocTransport(double distanta);
}
