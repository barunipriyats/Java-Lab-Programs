/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_11;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class Inter_thread_communication {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Customer c=new Customer();
        System.out.println("Your bank balance is Rs."+c.bank_amount);
        System.out.print("Enter the amount to be deposited : ");
        double depositamount=obj.nextDouble();
        System.out.print("Enter the amount to be credited : ");
        double creditamount=obj.nextDouble();
        depositprocess depositing=new depositprocess(c, depositamount);	
        creditprocess crediting=new creditprocess(c,creditamount);
        /*depositing.start();
        try {
        depositing.join();
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
        crediting.start();*/
    }
}

class Customer  {
    double bank_amount=0;
    synchronized void credit(double amount)
    {
        if(bank_amount<amount) {
            try {       
                System.out.println("Unable to credit!\nCredit amount exceeds the balance amount in bank!");
                wait(1000);
            }
            catch(InterruptedException e) {
                System.out.println(e);
            }
        }
        else {
        bank_amount-=amount;
        System.out.println("Amount credited!\nYour bank balance after crediting : Rs."+bank_amount);
        }
    }
    synchronized void deposit(double amount)
    {
        bank_amount+=amount;
        System.out.println("Amount deposited!\nYour bank balance after depositng : Rs."+bank_amount);
    }
}

class depositprocess extends Thread{
    double amount;
    Customer c;
    depositprocess(Customer c,double amount){
        this.c=c;
        this.amount = amount;
        new Thread(this).start();
    }
    public void run(){
        c.deposit(amount);
    }
}

class creditprocess extends Thread{
    double amount;
    Customer c;
    creditprocess(Customer c,double amount) {
        this.c=c;
        this.amount = amount;
        new Thread(this).start();
    }
    public void run(){
        c.credit(amount);
	}
}

