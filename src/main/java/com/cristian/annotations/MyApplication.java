package com.cristian.annotations;

import com.cristian.annotations.model.Instrument;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Instrument guitar = context.getBean("myGuitar", Instrument.class);
        System.out.println(guitar.getSound());
    }

}
