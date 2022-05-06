package clase;

public class Autobuz {
    private String numeSofer;
    private float consum;
    private int an;
    private String model;
    private int nrLoc;

    public Autobuz(String nume, float consum, int an, String model, int nrLoc) {
        this.numeSofer = nume;
        this.consum = consum;
        this.an = an;
        this.model = model;
        this.nrLoc = nrLoc;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setConsum(float consum) {
        this.consum = consum;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNrLoc(int nrLoc) {
        this.nrLoc = nrLoc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nume='").append(numeSofer).append('\'');
        sb.append(", consum=").append(consum);
        sb.append(", an=").append(an);
        sb.append(", model='").append(model).append('\'');
        sb.append(", nrLoc=").append(nrLoc);
        sb.append('}');
        return sb.toString();
    }
    public AutobuzMemento save(){
        AutobuzMemento nou=new AutobuzMemento(this.numeSofer,this.consum);
        return nou;
    }
    public void undo(AutobuzMemento a){
        this.numeSofer=a.getNume();
        this.consum=a.getConsum();
    }
}
