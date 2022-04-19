package singleton;

public class Singleton {
    //Elemente specifice Singleton:
    //instanta
    private static Singleton instanta=null;        //eager initialization ,static pt functie--cu new Singleton()
    //lazy initialization
    //functia de returnare a instantei unice
    public synchronized static Singleton returnareInstanta(){
        if(instanta==null) {
             instanta=new Singleton();
        }
        return instanta;
    }
    //constructor privat deoarece cel default este public ca sa nu mai poata fi accesat din ext
    private Singleton(){}





}
