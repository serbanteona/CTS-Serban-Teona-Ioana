package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        MijlocTransportHandler autobuzHandler=new AutobuzHandler();
        MijlocTransportHandler metrouHandler=new MetrouHandler();
        MijlocTransportHandler tramvaiHandler=new TramvaiHandler();
        MijlocTransportHandler troleibuzHandler=new TroleibuzHandler();
        troleibuzHandler.setMijlocTransportUrmator(autobuzHandler);
        autobuzHandler.setMijlocTransportUrmator(tramvaiHandler);
        tramvaiHandler.setMijlocTransportUrmator(metrouHandler);
        troleibuzHandler.recomandaMijlocTransport(2);
        troleibuzHandler.recomandaMijlocTransport(4);
        troleibuzHandler.recomandaMijlocTransport(8);
        troleibuzHandler.recomandaMijlocTransport(10);
    }
}
