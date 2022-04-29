package clase;

public class CardBancar implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Suma "+suma +"a fost platita prin card bancar");
    }
}
