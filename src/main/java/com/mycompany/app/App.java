package com.mycompany.app;

import org.apache.commons.io.FilenameUtils;
import java.lang.Runtime;

public class App 
{
    public static void main( String[] args ) 
    {
        try {
            System.out.println( "Hello World!" );
            String fileName = FilenameUtils.normalize("//../foo");
            System.out.println(fileName);
        } catch (Exception e) {
            // do nothing
        }
    }

    public App(String input) {
        Runtime r = Runtime.getRuntime();
        // ruleid: command-injection-formatted-runtime-call
        r.exec("/bin/sh -c some_tool" + input);
    }
}
