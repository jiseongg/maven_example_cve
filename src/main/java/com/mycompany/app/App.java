package com.mycompany.app;

import java.io.File;
import com.google.common.io.Files;
import org.apache.commons.io.FilenameUtils;
import org.apache.http.client.utils.URIBuilder;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;

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

    public void createFile() {
        Files.createTempDir();
    }

    public void unzip(String str) throws Exception {
        SevenZFile zipFile = new SevenZFile(new File(str));
        SevenZArchiveEntry entry;
        while ((entry = zipFile.getNextEntry()) != null) {
            System.out.println(entry.getName());
        }
    }
}
