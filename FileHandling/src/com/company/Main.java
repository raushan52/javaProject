package com.company;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String data = "File Handling in java.";

        try {
            FileOutputStream fos = new FileOutputStream("index.txt");
            byte[] byteData = data.getBytes();
            fos.write(byteData);
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        // read data
       try {
           FileInputStream fis = new FileInputStream("index.txt");

           int i = 0;
           while ((i = fis.read()) != -1) {
               System.out.print((char) i);
           }
           fis.close();
       } catch (Exception ex){
           System.out.println(ex);
       }


    }
}
