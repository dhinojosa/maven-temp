package com.vmware.asimov;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        InputStream is = App.class.getResourceAsStream("/server.properties");
        int i = 0;
        while ((i = is.read()) != -1){
        	System.out.print((char)i);
        }
    }
}
