package main;
import zoo.Zebra;
import zoo.Zoo;
import zoo.Girafa;
import zoo.Ingrijitor;

public class Main {
    public static void main(String[] args) {
        Ingrijitor ingrijitor=new Ingrijitor("Marc J");
        Zoo zoo=new Zoo("Gradina zoo",ingrijitor);
        zoo.addAnimal(new Girafa("Ziz"));
        zoo.addAnimal(new Zebra("Luca"));
        zoo.addAnimal(new Girafa("Bob"));
        zoo.hranesteAnimale();

    }
}
