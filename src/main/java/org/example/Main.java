package org.example;

public class Main {
    public static void main(String[] args) {

        Instrument violin = new Violin();

        Instrument eGuitar = new EGuitar();

        Screwdriver screwdriver = new Screwdriver();

        CanMakeNoise myFavoriteNoiseMaker = new Screwdriver();
        myFavoriteNoiseMaker.makeNoise();

        recordNoise(violin);
    }

    private static void recordNoise(CanMakeNoise something) {
        System.out.println("Start recording...");
        System.out.println("Recording: " + something.makeNoise());
        System.out.println("Stop recording...");
    }
}