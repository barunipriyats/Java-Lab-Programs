/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Ex_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;

/**
 *
 * @author Baruni Priya TS
 */
public class Copy_contents_from_one_file_to_another_file {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis=new FileInputStream("one.txt");
        FileOutputStream fos=new FileOutputStream("two.txt");
        int read;
        while((read=fis.read())!=-1)//reads each character from the file "one.txt"
        {
            if(read==' ')//if space is encountered, skip the loop by use of "continue" statement
                continue;
            fos.write(read);//writinf each character to "two.txt" file
        }
        fis.close();
        fos.close();
    } 
}
