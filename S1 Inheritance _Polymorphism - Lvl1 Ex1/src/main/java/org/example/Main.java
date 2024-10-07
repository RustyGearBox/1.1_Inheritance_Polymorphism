package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<instrument> instruments = new ArrayList<>();

        instruments.add(new instrument_cord("Guitar",120));
        instruments.add(new instrument_wind("Flute",60));
        instruments.add(new instrument_percussion("Batery",600));

        for (instrument ins : instruments) {
            System.out.println(ins.play());
        }
    }
}