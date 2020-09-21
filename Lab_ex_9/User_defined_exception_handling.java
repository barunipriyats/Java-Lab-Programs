/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_9;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class User_defined_exception_handling 
{
    public static void main(String[] args)
    {
        User_defined_exception_handling o=new User_defined_exception_handling();
        Scanner obj=new Scanner(System.in);
        double acquiringbank=0;
        System.out.print("Enter the amount present in your bank:Rs.");
        double bank=obj.nextDouble();//Rs.1,00,000
        System.out.print("Enter the amount to be credited from your bank:Rs.");
        double credit=obj.nextDouble();//Rs.50,000
        if(credit>bank)//if crediting amount is greater than the bank balance
        {
            System.out.println("OOPS!\nRs."+credit+" is not available in your bank");
            System.out.println("Your bank balance is Rs."+bank);
            return;
        }
        try
        {
            o.checker(credit,bank,acquiringbank);//call of checker method by passing arguments
        }
        catch(creditexception e)
        {
            System.out.println(e);//Printing the user defined message
        }
    }
    void checker(double credit,double bank,double acquiringbank) throws creditexception
    {
        if(credit>49000)//if crediting amount exceeds Rs.49,000 --> throw user defined exception
        {
            throw new creditexception("Sorry!\nMore than Rs.49,000 can't be credited at a time");
        }
        bank=bank-credit;//if crediting amount is less than Rs.49,000 --> the crediting amount is subtracted from your bank balance
        acquiringbank+=credit;//And the crediting amount is transferred to the acquiring bank
        System.out.println("Successfully credited!\nAmount present in your bank after crediting is Rs."+bank);//Printing your bank balance
    }
}

class creditexception extends Exception
{
    String message;
    creditexception(String msg)
    {
        message=msg;//Storing the user defined message in a string
    }
    public String toString()
    {
        return message;//returning the string message
    }
}
    