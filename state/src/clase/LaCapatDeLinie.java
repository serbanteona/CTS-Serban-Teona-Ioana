package clase;

public class LaCapatDeLinie implements State{
    @Override
    public void schimbaStare(Autobuz a) {
        if(!(a.getState() instanceof LaCapatDeLinie) ){
            System.out.println("Autobuzul cu nr"+a.getNrAutobuz()+"este la capat de linie");
            a.setState(this);
        }else{
            System.out.println("Autobuzul nu poate ajunge la capat de linie");
        }
    }
}
