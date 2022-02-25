package zoo;

public abstract class Animal {
   private String nume;
   public abstract void mananca(String mancare);

   public String getNume() {
      return nume;
   }

   public void setNume(String nume) {
      this.nume = nume;
   }

   public Animal(String nume) {
      this.nume = nume;
   }
}
