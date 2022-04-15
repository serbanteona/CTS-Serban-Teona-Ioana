package clase;

public class AutobuzNocturn implements MijlocTransport{
    Autobuz autobuz;

    public AutobuzNocturn(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(autobuz.numarPasageri>0){
            autobuz.opresteInStatie();
        }else{
            System.out.println("Autobuzul se retrage din statie");
        }
    }

}
