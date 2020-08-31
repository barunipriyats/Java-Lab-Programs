/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_6;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class Tax_calculation {
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the gender of the employee:");
        System.out.println("Press 'm' for male and press 'f' for female:");
        String gender=obj.next();
        System.out.println("Enter the income of the employee:");
        double salary=obj.nextDouble();
   
        employee1 e=new employee1();
        e.information(gender,salary);
        e.show();  
       
    } 
}


interface customer
{
    void information(String g,double s);
    void show();
}


class employee1 implements customer
{
    String gen;
    double sal;
    public void information(String g,double s)
    {
        gen=g;
        sal=s;
        
    }
    
    public void show()
    {
        System.out.println("Gender of the employee:"+gen);
        System.out.println("Income of the employee:"+sal);
        
        if(gen=="m")
        {
            if(sal<=190000)
                System.out.println("Tax percentage:NIL");
            else if(sal>190000 && sal<=200000)
                System.out.println("Tax percentage:10%");
            else if(sal>200000 && sal<=500000)
                System.out.println("Tax percentage:20%");
            else//if salary>500000
                System.out.println("Tax percentage:25%");
        }            
        else//if gender=='f'
        {
           if(sal<=190000)
                System.out.println("Tax percentage:NIL");
            else if(sal>190000 && sal<=200000)
                System.out.println("Tax percentage:NIL");
            else if(sal>200000 && sal<=500000)
                System.out.println("Tax percentage:10%");
            else//if salary>500000
                System.out.println("Tax percentage:20%"); 
        } 
    }
}

    