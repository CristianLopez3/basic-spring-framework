package com.cristian.xmlconfig.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CristianLopez345
 */

public class MyApplication {

    public static void main(String[] args) {
        var context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        var guitar = context.getBean("myGuitar", Instrument.class);
        System.out.println(guitar.getTune());

        context.close(); // free resources
    }

}