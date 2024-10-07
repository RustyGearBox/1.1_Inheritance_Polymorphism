package org.example;

public class instrument_wind extends instrument{

    public instrument_wind(String name, int price) {
        super(name, price);
    }

    @Override
    public String play() {
        return "A wind instrument it's been played";
    }

}