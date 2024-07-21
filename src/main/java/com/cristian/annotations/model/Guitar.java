package com.cristian.annotations.model;

import org.springframework.stereotype.Component;

@Component("myGuitar")
public class Guitar implements Instrument{

    @Override
    public String getSound() {
        return "Getting sound from Guitar class";
    }

}
