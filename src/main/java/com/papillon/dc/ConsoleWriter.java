package com.papillon.dc;

import org.springframework.stereotype.Component;

/**
 * Created by papillon on 5/15/2017.
 */
@Component
public class ConsoleWriter implements LogWriter {

    @Override
    public void write(String text) {
        System.out.println("Write to console: "+text);
    }
}
