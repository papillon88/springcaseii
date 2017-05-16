package com.papillon.dc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by papillon on 5/15/2017.
 */
@Component("fileWriter")
@Qualifier(value = "f_writer")
public class FileWriter implements LogWriter {
    @Override
    public void write(String text) {
        System.out.println("Write to file: "+text);
    }
}
