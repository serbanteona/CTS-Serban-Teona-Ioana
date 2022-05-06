package clase;

public class TramvaiHandler extends MijlocTransportHandler{
    @Override
   public  void recomandaMijlocTransport(double distanta) {
        if(distanta<10){
            System.out.println("Se recomanda folosirea tramvaiului "+distanta);
        }else{
            super.getMijlocTransportUrmator().recomandaMijlocTransport(distanta);
        }
    }
}
