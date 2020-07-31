/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class Student_list {
    public static void main(String[] args) {
        students obj[]=new students[10];
        for(int i=0;i<10;i++)
        {
            obj[i]=new students();
            System.out.println(""+(i+1));
            obj[i].getdata();
            obj[i].markcalc();
            obj[i].display();
        }
    }
}

class students
{
    String name,dept,status;
    double m1,m2,m3,avg;
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter name:");
        name=obj.next();
        System.out.println("Enter the department:");
        dept=obj.next();
        System.out.println("Enter the 3 subject marks");
        m1=obj.nextInt();
        m2=obj.nextInt();
        m3=obj.nextInt();
    }
    void markcalc()
    {
        avg=(m1+m2+m3)/3;
        if (m3<50 || m1<50 || m2<50)
        {
            status="Fail";
        }
        else
        {
            if(avg>=90)
                status="First class";
            if(avg>=70 && avg<=89)
                status="Second class";
            if(avg>=50 && avg<=69)
                status="Third class";
        }
    }
    void display()
    {
        System.out.println("Name:"+name+"\nDept:"+dept+"\nM1:"+m1+"\nM2:"+m2+"\nM3:"+m3+"\nAverage:"+avg+"\nStatus:"+status);
    }
}
