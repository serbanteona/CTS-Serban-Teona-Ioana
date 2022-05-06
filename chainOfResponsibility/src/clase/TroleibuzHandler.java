package clase;

public class TroleibuzHandler extends MijlocTransportHandler{
    public TroleibuzHandler(int pragSuperior) {
        super(pragSuperior);
    }

    @Override
  public  void recomandaMijlocTransport(double distanta) {
        if(distanta<pragSuperior){
            System.out.println("Se recomanda folosirea troleibuzului pentru distanta de " +distanta);

        }else{
            super.getMijlocTransportUrmator().recomandaMijlocTransport(distanta);
        }
    }
}
