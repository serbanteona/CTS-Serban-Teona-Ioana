package main;

import clase.LinieFactory;
import clase.ModelAutobuz;

public class Main {
    public static void main(String[] args) {
        ModelAutobuz autobuz1=new ModelAutobuz("Mercedes",2007,40);
        ModelAutobuz autobuz2=new ModelAutobuz("Mercedes",2008,38);
        ModelAutobuz autobuz3=new ModelAutobuz("Mercedes",2009,30);
        ModelAutobuz autobuz4=new ModelAutobuz("Mercedes",2010,55);
        LinieFactory factory=new LinieFactory();
        factory.getLinie(137).afisareDescriere(autobuz1);
        factory.getLinie(137).afisareDescriere(autobuz2);
        factory.getLinie(160).afisareDescriere(autobuz3);
        factory.getLinie(160).afisareDescriere(autobuz4);
    }
}
