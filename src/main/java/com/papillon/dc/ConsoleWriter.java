package com.papillon.dc;

/**
 * Created by papillon on 5/15/2017.
 */
public class ConsoleWriter implements LogWriter {

    @Override
    public void write(String text) {
        System.out.println("Write to console: "+text);
    }
}
