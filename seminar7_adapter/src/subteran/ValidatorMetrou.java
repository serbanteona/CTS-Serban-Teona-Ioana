package subteran;

public class ValidatorMetrou implements ValidatorSubteran {
    @Override
    public void valideazaCalatorie() {
        System.out.println("Bilet metrou validat");
    }

    @Override
    public void valideazaAbonament() {
        System.out.println("Abonament metrou validat");

    }
}
