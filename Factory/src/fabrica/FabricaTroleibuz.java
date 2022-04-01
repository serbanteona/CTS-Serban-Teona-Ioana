package fabrica;

import factory.MijlocTransport;
import factory.Troleibuz;

public class FabricaTroleibuz implements AbstractFactory{
    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
