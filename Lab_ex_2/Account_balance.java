/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_2;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class Account_balance {
    public static void main(String[] args) { 
        Scanner obj=new Scanner(System.in);
        account a=new account("19cse066","Baruni",0);
        System.out.println("ID:"+a.getID());
        System.out.println("Name"+a.getName());
        System.out.println("Balance:"+a.getBalance());
        System.out.println("Enter the amount to be credited:");
        int aa=obj.nextInt();
        System.out.println("Balance:"+a.credit(aa));
        System.out.println("Enter the amount to be debited:");
        int aaa=obj.nextInt();
        System.out.println("Balance:"+a.debit(aaa));
        account a1=new account("19cse067","Darathi",1000);
        System.out.println("Enter the amount to be transfered to the another account");
        int aaaa=obj.nextInt();
        System.out.println("Balance:"+a.transferTo(a1,aaaa));
        System.out.println(a);
        System.out.println(a1);
    
    }
    
}

class account
{
    String id;
    String name;
    int balance;
    account(String i,String n,int b)
    {
        id=i;
        name=n;
        balance=b;
    }
    account(String i,String n)
    {
        id=i;
        name=n;
    }
    String getID()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    int getBalance()
    {
        return balance;
    }
    int credit(int amount)
    {
        balance=balance+amount;
        return balance;
    }
    int debit(int amount)
    {
        if(amount<=balance)
            balance=balance-amount;
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }
    int transferTo(account a1,int amount)
    {
        if(amount<=balance)
        {
            balance=balance-amount;
            a1.balance=a1.balance+amount;
        }
        else
            System.out.println("Amount exceeded balance");
        return balance;            
    }
    public String toString()
   {
       return "\nID:"+id+"\tName:"+name+"\tBalance:"+balance;
   }
}
