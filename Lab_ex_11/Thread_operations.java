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
public class Thread_operations {
    public static void main(String[] args) {
        new operations().start();//Thread 1
    }
}

class operations extends Thread {
    public void run() {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the limit(Value for N) : ");
        int Nlimit=obj.nextInt();
        int numbers[]=new int[Nlimit];
        System.out.println("Enter the numebrs : ");
        for(int i=0;i<Nlimit;i++)
            numbers[i]=obj.nextInt();
        System.out.print("Entered numbers are : ");
        for(int i=0;i<Nlimit;i++)
            System.out.print(numbers[i]+" ");
        new divisibleby5(Nlimit,numbers).start();//Thread 2
    }
}

class divisibleby5 extends Thread {
    int Nlimit;
    int[] numbers;
    divisibleby5(int Nlimit,int[] numbers) {
        this.Nlimit=Nlimit;
        this.numbers=numbers;
    }
    public void run() {
        boolean flag=false;
        System.out.print("\nNumbers divisible by 5 : ");
        for(int i=0;i<numbers.length;i++) {
            if(numbers[i]%5==0) {
                flag=true;
                System.out.print(numbers[i]+"  ");       
            }
        }
        if(flag==false)
            System.out.print("Nil");
        System.out.println();
        new average(Nlimit,numbers).start();//Thread 3
    }
}

class average extends Thread {
    int Nlimit;
    int[] numbers;
    average(int Nlimit,int[] numbers) {
        this.Nlimit=Nlimit;
        this.numbers=numbers;
    }
    public void run() {
        double sum=0,average=0;
        System.out.print("Average of "+Nlimit+" numbers : ");
        for(int i=0;i<Nlimit;i++) {
            sum+=numbers[i];
        }
        average=sum/Nlimit;
        System.out.println(average);
    }
}