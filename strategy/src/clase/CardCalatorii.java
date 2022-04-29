package clase;

public class CardCalatorii implements ModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Suma "+suma +"a fost platita prin card calatorii");
    }
}
