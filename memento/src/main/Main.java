package main;

import clase.Autobuz;
import clase.AutobuzMemento;
import clase.ManagerAutobaza;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz("Andrei",3,2010,"Mercedes",25);
        ManagerAutobaza manager=new ManagerAutobaza();

        manager.add(autobuz.save());
        autobuz.setNumeSofer("Mihai");
        manager.add(autobuz.save());
        autobuz.setConsum(10);
        manager.add(autobuz.save());
        System.out.println(autobuz);


    }
}
