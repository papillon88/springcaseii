package com.papillon.dc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by papillon on 5/15/2017.
 */
public class App {

    public static void main(String[] args){

        ApplicationContext context =
                new FileSystemXmlApplicationContext("ApplicationContext.xml");

        Logger logger = (Logger)context.getBean("logger");
        logger.writeConsole("hello debas");
        logger.writeFile("hello debas");
    }
}
