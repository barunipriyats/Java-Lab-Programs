/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Ex_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Baruni Priya T S
 */
public class CharacterStream_ByteStream {
    public static void main(String[] args) throws IOException {
        //Use of ByteStream
       FileInputStream fis=null;
       FileOutputStream fos=null;
       fis=new FileInputStream("input.jpg");
       fos=new FileOutputStream("output.jpg");
       int read;
       while((read=fis.read())!=-1)//reads each character in the source file
           fos.write(read);//writing the characters to the destination file
       fis.close();
       fos.close();
       
       //Use of CharacterStream
       FileReader fr=null;
       FileWriter fw=null;
       fr=new FileReader("input1.jpg");
       fw=new FileWriter("output1.jpg");
       int i;
       while((i=fr.read())!=-1)//reads each character in the source file
           fw.write(i);//writing the characters to the destination file
       fr.close();
       fw.close();
       
    }
    
}
