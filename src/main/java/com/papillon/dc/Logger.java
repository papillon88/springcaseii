package com.papillon.dc;

import java.io.File;

/**
 * Created by papillon on 5/15/2017.
 */
public class Logger {

    private ConsoleWriter consoleWriter;
    private FileWriter fileWriter;

    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

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
