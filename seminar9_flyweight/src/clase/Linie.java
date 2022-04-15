package clase;

public class Linie implements Flyweight {
    int nrLinie;
    String primaStatie;
    String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    public int getNrLinie() {
        return nrLinie;
    }

    @Override
    public void afisareDescriere(ModelAutobuz a) {
        System.out.println(a.toString()+toString());

    }
}
