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
public class Employee_details {
    public static void main(String[] args) {
        employee e=new manager();
        employee ee=new manager();
        employee eee=new clerk();
        System.out.println("Enter 1st Manager details:");
        e.getdetails();
        System.out.println("Enter 2nd manager details:");
        ee.getdetails();
        System.out.println("Enter clerk details:");
        eee.getdetails();
        System.out.println("1st manager details:");
        System.out.println(e);
        System.out.println("Salary:Rs."+e.CalcSalary());
        System.out.println("2nd manager details:");
        System.out.println(ee);
        System.out.println("Salary:Rs."+ee.CalcSalary());
        System.out.println("Clerk details:");
        System.out.println(eee);
        System.out.println("Salary:Rs."+eee.CalcSalary());
              
        
    }
    
}

abstract class employee
{
    Scanner obj=new Scanner(System.in);
    String name;
    int age;
    float hourRate;
    void getdetails()
    {
        System.out.println("Enter the name:");
        name=obj.next();
        System.out.println("Enter the age:");
        age=obj.nextInt();
        System.out.println("Enter the number of hours worked:");
        hourRate=obj.nextFloat();
    }
    abstract double CalcSalary();
    public String toString()
    {
        return "Name:"+name+"\nAge:"+age+"\nHours worked:"+hourRate; 
    }
}

class manager extends employee
{
    float m_salary;
    double CalcSalary()
    {
        m_salary=hourRate*500;//considering 1 hour=Rs.500
        return m_salary;
    }   
}

class clerk extends employee
{
    float e_salary;
    double CalcSalary()
    {
        e_salary=hourRate*100;//considering 1 hour=Rs.100
        return e_salary;
    }

}

