package main;

import builder.Autobuz;
import builder.AutobuzBuilder;

public class Main {
    public static void main(String[] args){
        Autobuz autobuz1=new AutobuzBuilder().setModel("Ford").setNumeSofer("Vasile").build();
        Autobuz autobuz2=new AutobuzBuilder().setNrInmatriculare("12345").build();

        System.out.println(autobuz1.toString());
        System.out.println(autobuz2.toString());
    }
}
