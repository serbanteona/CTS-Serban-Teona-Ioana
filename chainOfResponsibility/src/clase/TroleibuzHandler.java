package clase;

public class TroleibuzHandler extends MijlocTransportHandler{
    @Override
  public  void recomandaMijlocTransport(double distanta) {
        if(distanta<3){
            System.out.println("Se recomanda folosirea troleibuzului pentru distanta de " +distanta);

        }else{
            super.getMijlocTransportUrmator().recomandaMijlocTransport(distanta);
        }
    }
}
