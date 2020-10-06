/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Ex_10;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Baruni Priya T S
 */
public class File_handling {
    public static void main(String[] args) throws IOException
    {
        int i=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the file name:");//first.txt
        String file=obj.next();//inputs the file name from the user
        File f=new File(file);
        if(f.exists())//if the file exists
            System.out.println("File exists");
        else//if the file doesn't exist
        {
            System.out.println("File doesn't exist");
            return;
        }
        System.out.println("Name of the file : "+f.getName());//display the name of the file
        System.out.println("The file is readable : "+f.canRead());//returns true if readability of the file is enabled or else it returns false
        System.out.println("The file is writable : "+f.canWrite());//returns true if writability of the file is enablea or else it returns false
        System.out.print("The type of file : ");
        char c[]=file.toCharArray();
        while(c[i]!='.')//until '.' character is encountered, increment 'i' value
            i++;
        for(int j=i;i<c.length;j++)
        {
            System.out.print(c[j]);//printing the characters after the '.' charaacter-->type of file
            i++;
        }
        System.out.println(" file");
        System.out.println("Length of the file : "+f.length()+" bytes");//length of the file in bytes
    }
    
}
