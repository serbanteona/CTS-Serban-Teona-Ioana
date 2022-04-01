package main;

import prototype.Autobuz;
import prototype.MijlocTransport;

public class Main {
    public static void main(String[] args){
      Autobuz autobuz=new Autobuz("Andrei");
      //nu este buna varianta asta:(String este imutabila si aloca mereu memorie pt concatenare
      String a="Ana";
      a=a+"are"+"mere";
      //de asta folosim stringbuilder

      StringBuilder builder=new StringBuilder();
      builder.append("Ana").append("are").append("mere");
      try{

          Autobuz autobuz2=(Autobuz) autobuz.copiaza();
          autobuz2.setSoferAutobuz("Matei");
          System.out.println(autobuz.getSoferAutobuz());
          System.out.println(autobuz2.getSoferAutobuz());
      }catch(CloneNotSupportedException e){
          System.out.println(e);
      }

    }
}
