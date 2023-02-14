package org.example;

public class SplashMachine {

    public Splash getSplash (String name){
        switch (name){
            case "SmallSplash":
                return new SmallSplash();
            case "LargeSplash":
                return new LargeSplash();
            case "LandLord":
                return new Landlord();
            default:
                return null;
        }
    }

    public Splash[] getSplashs(String name, int qty){
        Splash[] products = new Splash[qty];
        int i = 0;
        while(i<qty){
            products[i]=getSplash(name);
            i++;
        }
        return products;
    }

}
