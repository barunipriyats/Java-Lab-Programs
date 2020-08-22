/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_5;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class Stud_dept_clg {
    public static void  main(String[] args) {
       /* Department obj=new Department();
        Student obj1=new Student();
        obj.getdeptdetails();
        obj1.getstuddetails();
        obj.displaydept();
        obj1.displaystud();      */
       Department[] d=new Department[10];
       Student[] s=new Student[10];
       for(int i=0;i<10;i++)
       {
           d[i]=new Department();
           d[i].getdeptdetails();
           s[i]=new Student();
           s[i].getstuddetails();
           d[i].displaydept();
           s[i].displaystud();
       }
    }
}

class College
{
    String clgname;
    int clgcode;
    Scanner obj=new Scanner(System.in);
    public void getclgdetails()
    {
        System.out.println("Enter college name:");
        clgname=obj.next();
        System.out.println("Enter college code:");
        clgcode=obj.nextInt(); 
    }
    public void displayclg()
    {
        System.out.println("College details:");
        System.out.println("Name:"+clgname+"\nCode:"+clgcode);
    }
}

class Department extends College
{
    String deptname;
    public void getdeptdetails()
    {
        super.getclgdetails();
        System.out.println("Enter department name:");
        deptname=obj.next();       
    }
    public void displaydept()
    {
        super.displayclg();
        System.out.println("Department details:");
        System.out.println("Name:"+deptname);
    }
}

class Student extends Department
{
    String name,roll_no;
    double dm,dpsd,oops,ds,ce,total,average;
    public void getstuddetails()
    {
        
        System.out.println("Enter student name:");
        name=obj.next();
        System.out.println("Enter student roll number:");
        roll_no=obj.next();
        System.out.println("Enter dm amrk:");
        dm=obj.nextDouble();
        System.out.println("Enter dpsd amrk:");
        dpsd=obj.nextDouble();
        System.out.println("Enter oops amrk:");
        oops=obj.nextDouble();
        System.out.println("Enter ds amrk:");
        ds=obj.nextDouble();
        System.out.println("Enter ce amrk:");
        ce=obj.nextDouble();        
        total=dm+dpsd+oops+ds+ce;
        average=total/5;
    }
    public void displaystud()
    {
        
        System.out.println("Student details:");
        System.out.println("Name:"+name+"\nRoll Number:"+roll_no+"\nDM mark:"+dm+"\nDPSD mark:"+dpsd+"\nOOPS mark:"+oops+"\nDS mark:"+ds+"\nCE mark:"+ce);
        System.out.println("Total:"+total+"\nAverage:"+average);
        
    }
}