package main;

import terestru.ValidatorAdapter;
import terestru.ValidatorAutobuz;
import terestru.ValidatorTerestru;

public class Main {
   static void valideazaBiletCalatorie(ValidatorTerestru validatorTerestru){
        validatorTerestru.valideazaBilet();
    }
    public static void main(String[] args){
        ValidatorAutobuz validatorAutobuz=new ValidatorAutobuz();
        valideazaBiletCalatorie(validatorAutobuz);
        ValidatorAdapter validatorAdapter=new ValidatorAdapter();
        valideazaBiletCalatorie(validatorAdapter);

    }
}
