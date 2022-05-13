package main;

import clase.Autobuz;
import clase.ComandaPlecareInCursa;
import clase.Command;
import clase.Operator;

public class Main {
    public static void main(String[] args) {
        Autobuz a=new Autobuz("B22AAAA");
        Autobuz a2=new Autobuz("B23BBB");
        Operator operator=new Operator();
        Command comanda=new ComandaPlecareInCursa(3,a);
        Command comanda2=new ComandaPlecareInCursa(4,a2);
        Command comanda3=new ComandaPlecareInCursa(5,a2);
        Command comanda4=new ComandaPlecareInCursa(6,a);
        operator.adauga(comanda);
        operator.adauga(comanda2);
        operator.adauga(comanda3);
        operator.adauga(comanda4);
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();



    }
}
