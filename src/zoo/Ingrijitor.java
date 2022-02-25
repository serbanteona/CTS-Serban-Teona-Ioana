package zoo;

public class Ingrijitor {
    private String nume;
    public void hranesteAnimal(Animal animal,String mancare){
       animal.mananca(mancare);
    }

    public String getNume() {
        return nume;
    }

    public Ingrijitor(String nume) {
        this.nume = nume;
    }
}
