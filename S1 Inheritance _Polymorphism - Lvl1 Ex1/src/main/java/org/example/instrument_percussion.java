package org.example;

public class instrument_percussion extends instrument{

    public instrument_percussion(String name, int price) {
        super(name, price);
    }

    @Override
    public String play() {
        return "A percussion instrument it's been played";
    }

}