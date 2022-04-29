package clase;

public class ValidatorCalatorie {
    private ModPlata modPlata;
    private double suma;

    public ValidatorCalatorie(double suma) {
        this.suma = suma;
        this.modPlata=new CardCalatorii();

    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }
    public void platesteCalatorie(){
        modPlata.plateste(suma);

    }
}
