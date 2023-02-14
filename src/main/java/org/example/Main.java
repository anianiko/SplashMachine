package org.example;

public class Main {
    public static void main(String[] args) {

        SplashMachine splashMachine = new SplashMachine();

        Splash splash = splashMachine.getSplash("SmallSplash");

         Ratio ratio = splash.getRatio();

         System.out.println("Wine" + ratio.getWine() + ", water: " + ratio.getWater());

         Splash[] products = splashMachine.getSplashs("LargeSplash",13);

         for (int i=0; i<products.length; i++){
             Ratio ratio2 = products[i].getRatio();
             System.out.println("Water: " + ratio2.getWater() + " wine: " + ratio2.getWine());
         }

    }
}