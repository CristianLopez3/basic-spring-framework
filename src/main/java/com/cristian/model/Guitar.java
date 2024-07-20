package com.cristian.model;

public class Guitar implements Instrument {

    private Tune tune;

    public Guitar(Tune tune) {
        this.tune = tune;
    }

    public String getSound() {
        return "Guitar sound";
    }

    @Override
    public String getTune() {
        return String.format("Guitar %s: " , tune.tunning());

    }

}
