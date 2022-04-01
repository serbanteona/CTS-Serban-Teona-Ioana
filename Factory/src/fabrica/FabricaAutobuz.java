package fabrica;

import factory.Autobuz;
import factory.MijlocTransport;

public class FabricaAutobuz implements AbstractFactory{
    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
