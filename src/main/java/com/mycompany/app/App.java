package com.mycompany.app;

import org.apache.commons.io.FilenameUtils;
import org.apache.http.client.utils.URIBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        try {
            System.out.println( "Hello World!" );
            String fileName = FilenameUtils.normalize("//../foo");
            URIBuilder builder = new URIBuilder();
            System.out.println(builder.build().toString());
            System.out.println(fileName);
        } catch (Exception e) {
            System.err.println("error occurred");
            System.err.println(e.toString());
        }
    }
}
