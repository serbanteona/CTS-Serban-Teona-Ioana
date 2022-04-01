package fabrica;

import factory.MijlocTransport;
import factory.Tramvai;

public class FabricaTramvai implements AbstractFactory{

    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
