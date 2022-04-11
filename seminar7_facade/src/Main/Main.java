package Main;

import facade.Autobuz;
import facade.Fatada;

public class Main {
    public static void main(String[] args){
        Autobuz a=new Autobuz();
        Fatada.deschideUsi(a);
        Fatada.punePeLiberUsi(a);

    }
}
