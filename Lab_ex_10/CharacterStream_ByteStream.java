/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_10;

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
       fis=new FileInputStream("C:\\Users\\Baruni Priya TS\\Documents\\NetBeansProjects\\Unit1,2,3,4,5\\src\\Lab_Ex_10\\input.jpg");
       fos=new FileOutputStream("C:\\Users\\Baruni Priya TS\\Documents\\NetBeansProjects\\Unit1,2,3,4,5\\src\\Lab_Ex_10\\output.jpg");
       int read;
       while((read=fis.read())!=-1)//reads each character in the source file
           fos.write(read);//writing the characters to the destination file
       fis.close();
       fos.close();
       
       //Use of CharacterStream
       FileReader fr=null;
       FileWriter fw=null;
       fr=new FileReader("C:\\Users\\Baruni Priya TS\\Documents\\NetBeansProjects\\Unit1,2,3,4,5\\src\\Lab_Ex_10\\input1.jpg");
       fw=new FileWriter("C:\\Users\\Baruni Priya TS\\Documents\\NetBeansProjects\\Unit1,2,3,4,5\\src\\Lab_Ex_10\\output1.jpg");
       int i;
       while((i=fr.read())!=-1)//reads each character in the source file
           fw.write(i);//writing the characters to the destination file
       fr.close();
       fw.close();  
    } 
}
