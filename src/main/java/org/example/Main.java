package org.example;

public class Main {
    public static void main(String[] args) {

        SplashMachine splashMachine = new SplashMachine();

        Splash splash = splashMachine.getSplash("SmallSplash");

         Ratio ratio = splash.getRatio();

         System.out.println("Wine" + ratio.getWine() + ", water: " + ratio.getWater());
    }
}