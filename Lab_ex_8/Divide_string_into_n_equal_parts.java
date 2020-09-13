/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_8;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class Divide_string_into_n_equal_parts {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=obj.next();//"abcdefghijklmnopqrstuvwxy"
        System.out.println("\nThe given string is "+str);
        int len=str.length();
        int n=5;//divide by 5 equal parts
        int part;
        if(len%n!=0) 
        {
            System.out.println("Invalid Input");
            System.out.println("String size is not divisible by n");
            return;
        }
        part=len/n;//part=25/5=5
        System.out.print("The given string is divided into "+n+" equal parts and they are:");
        for(int i=0;i<len;i++) 
        {
            if(i%part==0)
            {
                System.out.print("\t");
            }
            System.out.print(str.charAt(i));
        }
    }

}
