package clase;

public class LaReparat implements State{
    @Override
    public void schimbaStare(Autobuz a) {
        if(a.getState() instanceof LaCapatDeLinie){
            System.out.println("Autobuzul cu numarul "+a.getNrAutobuz()+"a ajuns la reparat");
        }else{
            System.out.println("Autobuzul nu poate ajunge la reparat");
        }
    }
}
