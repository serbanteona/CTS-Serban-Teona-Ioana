package prototype;

public class Tramvai implements MijlocTransport{
    private String soferTramvai;
    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

    public Tramvai(String soferTramvai) {
        this.soferTramvai = soferTramvai;
    }

    public String getSoferTramvai() {
        return soferTramvai;
    }

    public void setSoferTramvai(String soferTramvai) {
        this.soferTramvai = soferTramvai;
    }
}
