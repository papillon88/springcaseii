package com.papillon.dc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

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
    private WaterWriter waterWriter;

    //@Autowired
    /*public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter) {
        this.consoleWriter = consoleWriter;
        this.fileWriter = fileWriter;
    }*/

    //@Autowired(required = false)
    @Autowired
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    @Autowired
    @Qualifier(value = "f_writer")
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    @Autowired
    @Qualifier(value = "w_writer")
    public void setWaterWriter(WaterWriter waterWriter) {
        this.waterWriter = waterWriter;
    }

    public void writeFile(String text){
        fileWriter.write(text);
    }

    public void writeConsole(String text){
        try {
            consoleWriter.write(text);
        } catch (Exception e){

        }
    }

    public void writeWater(String text) {
        waterWriter.write(text);
    }

}
