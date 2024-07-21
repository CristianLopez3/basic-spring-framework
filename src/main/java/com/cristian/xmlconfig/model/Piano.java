package com.cristian.xmlconfig.model;

public class Piano implements Instrument{

    private Tune tune;

    @Override
    public String getSound() {
        return "Piano sound";
    }

    @Override
    public String getTune() {
        return String.format("Piano %s: " , tune.tunning());
    }
}

