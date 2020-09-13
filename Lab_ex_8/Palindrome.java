/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_8;
import java.util.Scanner;
/**
 *
 * @author BaruniPriya T S
 */
public class Palindrome {
    public static void main(String[] args)
    {
        String a="",str;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string:");
        str=obj.next();//input the string in str
        int n=str.length();//store the length of the string in n
        for(int i=n-1;i>=0;i--)
        {
            a=a+str.charAt(i);//each character of the string 'str' is stored in string 'a' from last character to first character
        }
        if(a.equalsIgnoreCase(str))//comparing both the strings
        {
            System.out.println("String is a palindrome");
        }
        else
        {
            System.out.println("String is not a palindrome");
        }
    }
    
}
