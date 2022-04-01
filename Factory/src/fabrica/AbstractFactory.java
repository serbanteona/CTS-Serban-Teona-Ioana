package fabrica;

import factory.MijlocTransport;

public interface AbstractFactory {
    public MijlocTransport getMijlocTransport(String nrInmatriculare);
}
