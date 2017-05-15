package com.papillon.dc;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;

/**
 * Created by papillon on 5/15/2017.
 */
public class Logger {

    /*autowiring can be mixed and matched too.
    like autowire one property using constructor and the
            other using private instance fields
            also its not necessary to have setters and getters
    for autowire.*/

    //@Autowired
    private ConsoleWriter consoleWriter;
    //@Autowired
    private FileWriter fileWriter;

    //@Autowired
    public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
        this.consoleWriter = consoleWriter;
        this.fileWriter = fileWriter;
    }

    @Autowired
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    @Autowired
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }


    public void writeFile(String text){
        fileWriter.write(text);
    }

    public void writeConsole(String text){
        consoleWriter.write(text);
    }
}
