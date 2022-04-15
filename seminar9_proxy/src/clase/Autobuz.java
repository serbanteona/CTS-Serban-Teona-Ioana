package clase;

public class Autobuz implements MijlocTransport{
    int numarPasageri;
    int numarLinie;

    public Autobuz(int numarPasageri, int numarLinie) {
        this.numarPasageri = numarPasageri;
        this.numarLinie = numarLinie;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul de pe linia "+numarLinie + "cu "+numarPasageri+"pasageri "+"a oprit in statie");
    }

    public int getNumarPasageri() {
        return numarPasageri;
    }

    public void setNumarPasageri(int numarPasageri) {
        this.numarPasageri = numarPasageri;
    }

    public int getNumarLinie() {
        return numarLinie;
    }

    public void setNumarLinie(int numarLinie) {
        this.numarLinie = numarLinie;
    }
}
