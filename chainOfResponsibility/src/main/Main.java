package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        MijlocTransportHandler autobuzHandler=new AutobuzHandler(5);
        MijlocTransportHandler metrouHandler=new MetrouHandler(100000);
        MijlocTransportHandler tramvaiHandler=new TramvaiHandler(10);
        MijlocTransportHandler troleibuzHandler=new TroleibuzHandler(3);
        troleibuzHandler.setMijlocTransportUrmator(autobuzHandler);
        autobuzHandler.setMijlocTransportUrmator(tramvaiHandler);
        tramvaiHandler.setMijlocTransportUrmator(metrouHandler);
        troleibuzHandler.recomandaMijlocTransport(2);
        troleibuzHandler.recomandaMijlocTransport(4);
        troleibuzHandler.recomandaMijlocTransport(8);
        troleibuzHandler.recomandaMijlocTransport(10);
        System.out.println("-----------------------------");

        MijlocTransportHandler handlerMetrouCluj=new MetrouHandler(2);
        MijlocTransportHandler handlerTramvaiCluj=new TramvaiHandler(4);
        MijlocTransportHandler handlerTroleibuzCluj=new TroleibuzHandler(6);
        MijlocTransportHandler handlerAutobuzCluj=new AutobuzHandler(1000);
        handlerMetrouCluj.setMijlocTransportUrmator(handlerTramvaiCluj);
        handlerTramvaiCluj.setMijlocTransportUrmator(handlerTroleibuzCluj);
        handlerTroleibuzCluj.setMijlocTransportUrmator(handlerAutobuzCluj);
        //il trimitem cu cea mai mica
        handlerMetrouCluj.recomandaMijlocTransport(5);
        handlerMetrouCluj.recomandaMijlocTransport(1);
        handlerMetrouCluj.recomandaMijlocTransport(25);



    }
}
