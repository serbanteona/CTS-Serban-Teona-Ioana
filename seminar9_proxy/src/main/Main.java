package main;

import clase.Autobuz;
import clase.AutobuzNocturn;
import clase.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        MijlocTransport autobuz=new Autobuz(5,3);
        autobuz.opresteInStatie();
        MijlocTransport autobuzNocturn=new AutobuzNocturn((Autobuz) autobuz);
        autobuzNocturn.opresteInStatie();
        //autobuz.setNumarPasageri(0);
        autobuz.opresteInStatie();

    }
}
