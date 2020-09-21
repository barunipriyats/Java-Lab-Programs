/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_9;
/**
 *
 * @author Baruni Priya T S
 */
public class Buildin_exception_handling 
{
    public static void main(String[] args)
    {
        try
        {
           int num1=30;
           int num2=0;
           int result=num1/num2;//Error --> 30 is not divisible by zero
           System.out.println("Result:"+result);        
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        
        try
        {
            int a[]=new int[10];
            a[100]=100;//Error --> 100th index element can't be assigned a value as the array limit is 10 
            System.out.println("Element in index 100:"+a[100]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);                       
        }  
        
        try
        {
            int num=Integer.parseInt("BARUNI");//Error --> String can't be converted into integer using this statement
            System.out.println(num);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }     
        
        try
        {
            String str="BARUNI";
            char c=str.charAt(10);//Error --> As the string length is 6, the 10th character in the string can't be accessed
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
