package clase;

public class Autobuz {
    private State state;
    private int nrAutobuz;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz =nrAutobuz;
        this.state=new LaCapatDeLinie();
    }
   public void pleacaInCursa(){
        State incursa=new InCursa();
        incursa.schimbaStare(this);
    };
   public void intraInService(){
        State lareparat=new LaReparat();
        lareparat.schimbaStare(this);
    };
    public void ieseDinService(){
        State laCapatDeLinie=new LaCapatDeLinie();
        laCapatDeLinie.schimbaStare(this);
    };
    public void ajungeLaCapatDeLinie(){
        State laCapatDeLinie=new LaCapatDeLinie();
        laCapatDeLinie.schimbaStare(this);
    };

}
