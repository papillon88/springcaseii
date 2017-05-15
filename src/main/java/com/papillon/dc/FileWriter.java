package com.papillon.dc;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by papillon on 5/15/2017.
 */
@Qualifier(value = "f_writer")
public class FileWriter implements LogWriter {
    @Override
    public void write(String text) {
        System.out.println("Write to file: "+text);
    }
}
