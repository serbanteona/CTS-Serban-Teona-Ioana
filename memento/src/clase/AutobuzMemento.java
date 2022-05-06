package clase;

public class AutobuzMemento {
    private String nume;
    private float consum;

    public AutobuzMemento(String nume, float consum) {
        this.nume = nume;
        this.consum = consum;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getConsum() {
        return consum;
    }

    public void setConsum(float consum) {
        this.consum = consum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzMemento{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", consum=").append(consum);
        sb.append('}');
        return sb.toString();
    }
}
