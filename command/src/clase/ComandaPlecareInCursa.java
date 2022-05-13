package clase;

public class ComandaPlecareInCursa implements Command {
    private int linie;
    private Autobuz autobuz;

    public ComandaPlecareInCursa(int linie, Autobuz autobuz) {
        this.linie = linie;
        this.autobuz = autobuz;
    }

    public int getLinie() {
        return linie;
    }

    public void setLinie(int linie) {
        this.linie = linie;
    }

    public Autobuz getAutobuz() {
        return autobuz;
    }

    public void setAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void executa() {
        autobuz.plecareInCursa(linie);

    }
}
