package clase;

public class InCursa implements State{
    @Override
    public void schimbaStare(Autobuz a) {
        if(a.getState() instanceof LaCapatDeLinie){
            System.out.println("Autobuzul cu nr"+a.getNrAutobuz()+"a plecat in cursa");
            a.setState(this);

        }else{
            System.out.println("Autobuzul nu poate pleca in cursa");
        }
    }
}
