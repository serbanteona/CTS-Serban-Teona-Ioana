package main;

import fabrica.FabricaAutobuz;
import fabrica.FabricaTramvai;
import fabrica.FabricaTroleibuz;
import factory.MijlocTransport;

public class Main {
    public static void main(String[] args){
        MijlocTransport autobuz=new FabricaAutobuz().getMijlocTransport("BC98IMM");
        MijlocTransport tramvai=new FabricaTramvai().getMijlocTransport("BC98IOO");
        MijlocTransport troleibuz=new FabricaTroleibuz().getMijlocTransport("BC98IME");
        autobuz.afisareNrInmatriculare();
        tramvai.afisareNrInmatriculare();
        troleibuz.afisareNrInmatriculare();

    }
}
