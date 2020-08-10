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
public class Total_average {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Total_average ta=new Total_average();
        
        double a[]=new double[5];
        double b[]=new double[5];   
        double c[]=new double[5];
        double d[]=new double[5];
        double e[]=new double[5];
           
        System.out.println("Enter 5 subject(ENG,TAM,MAT,SCI,SOC) marks of student 1:");
        for(int i=0;i<=4;i++)
            a[i]=obj.nextDouble();
        System.out.println("Enter 5 subject(ENG,TAM,MAT,SCI,SOC) marks of student 2:");
        for(int i=0;i<=4;i++)
            b[i]=obj.nextDouble();
        System.out.println("Enter 5 subject(ENG,TAM,MAT,SCI,SOC) marks of student 1:");
        for(int i=0;i<=4;i++)
            c[i]=obj.nextDouble();
        System.out.println("Enter 5 subject(ENG,TAM,MAT,SCI,SOC) marks of student 1:");
        for(int i=0;i<=4;i++)
            d[i]=obj.nextDouble();
        System.out.println("Enter 5 subject(ENG,TAM,MAT,SCI,SOC) marks of student 1:");
        for(int i=0;i<=4;i++)
            e[i]=obj.nextDouble();
        
        list l=new list();
        l.calc(a,1);
        l.calc(b,2);
        l.calc(c,3);
        l.calc(d,4);
        l.calc(e,5);
        
        ta=null;
        System.gc();//calling destructor
    }
    
    public void finalize()//Destructor
    {
        System.out.println("Object is destroyed by the Garbage Collector");
    }
    
}

class list
{   
    double total,average;
   
    list() 
    {
        total=0;
        average=0;
    }
    
    void calc(double array[],int stud) 
    {
        for(int i=0;i<4;i++)
            total=total+array[i];
        average=total/5;
        System.out.println("Student "+stud+":");
        System.out.println("Total:"+total);
        System.out.println("Average:"+average+"\n");
    }
   
}