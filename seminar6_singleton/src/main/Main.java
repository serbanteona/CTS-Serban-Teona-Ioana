package main;

import singleton.Singleton;

public class Main {
    public static void main(String[] args){
        Singleton singleton=Singleton.returnareInstanta();
        Singleton s2=Singleton.returnareInstanta();
        System.out.println(singleton);
        System.out.println(s2);


    }
}
