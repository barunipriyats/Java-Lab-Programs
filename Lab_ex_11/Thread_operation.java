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
public class Thread_operation {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        try {
        System.out.println("Enter the count of numbers:");
        int Nlimit=obj.nextInt();
        int numbers[]=new int[Nlimit];
        System.out.println("Enter the numbers:");
        for(int i=0;i<Nlimit;i++)
            numbers[i]=obj.nextInt();
        thread1 th1= new thread1(Nlimit,numbers);
        Thread t1=new Thread(th1);
        thread2 th2=new thread2(Nlimit,numbers);
        Thread t2=new Thread(th2);
        thread3 th3=new thread3(Nlimit,numbers);
        Thread t3=new Thread(th3);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
    } 
}

class thread1 implements Runnable {
    public  int Nlimit;
    public int[] numbers;
    public thread1(int Nlimit, int[] numbers) {
        this.Nlimit = Nlimit;
        this.numbers = numbers;
    }
    public void run() {
        System.out.print("Entered numbers : ");
        for(int i=0;i<Nlimit;i++)
            System.out.print(numbers[i]+" ");
        System.out.println();
    }
}

class thread2  extends thread1 implements Runnable {
    public thread2(int Nlimit, int[] numbers) {
        super(Nlimit, numbers);
    }
    public void run() {
        boolean flag=false;
        System.out.print("Numbers divisible by 5 : ");
        for(int i=0;i<numbers.length;i++) {
            if(numbers[i]%5==0) {
                flag=true;
                System.out.print(numbers[i]+"  ");       
            }
        }
        if(flag==false)
            System.out.print("Nil");
        System.out.println();
    }
}

class thread3 extends thread2 implements Runnable {

    public thread3(int Nlimit, int[] numbers) {
        super(Nlimit, numbers);
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