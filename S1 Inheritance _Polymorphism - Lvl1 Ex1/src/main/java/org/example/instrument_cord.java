package org.example;

public class instrument_cord extends instrument{

    public instrument_cord(String name, int price) {
        super(name, price);
    }

    @Override
    public String play() {
        return "A string instrument it's been played";
    }

}