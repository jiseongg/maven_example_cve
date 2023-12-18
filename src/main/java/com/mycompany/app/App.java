package com.mycompany.app;

import org.apache.commons.io.FilenameUtils;

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

}
