package clase;

public class TramvaiHandler extends MijlocTransportHandler{
    public TramvaiHandler(int pragSuperior) {
        super(pragSuperior);
    }

    @Override
   public  void recomandaMijlocTransport(double distanta) {
        if(distanta<pragSuperior){
            System.out.println("Se recomanda folosirea tramvaiului "+distanta);
        }else{
            super.getMijlocTransportUrmator().recomandaMijlocTransport(distanta);
        }
    }
}
