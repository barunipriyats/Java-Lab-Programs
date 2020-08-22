/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_5;

/**
 *
 * @author Baruni Priya T S
 */
public class Bank_balance {
    public static void  main(String[] args) {
        BankA a=new BankA();
        System.out.println("Amount deposited in Bank A : $"+a.getBalance());
        BankB b=new BankB();
        System.out.println("Amount deposited in Bank B : $"+b.getBalance());
        BankC c=new BankC();
        System.out.println("Amount deposited in Bank C : $"+c.getBalance());
    }
    
}

class Bank
{
    int getBalance()
    {
        return 0;
    }
}

class BankA extends Bank
{
    int getBalance()
    {
        return 1000;
    }
} 

class BankB extends Bank
{
    int getBalance()
    {
        return 1500;
    }
}

class BankC extends Bank
{
    int getBalance()
    {
        return 2000;
    }
}
