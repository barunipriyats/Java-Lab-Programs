/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_7;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
/**
 *
 * @author Baruni Priya T S
 */
public class Employee_sort {
    public static void main(String[] args) {
        employee e=new employee("Sonal",40000);//1
        ArrayList<employee> list=new ArrayList<>();
        list.add(e);
        list.add(new employee("Geminika Muthu",75000));//2
        list.add(new employee("Dharshini Sree",35000));//3
        list.add(new employee("Jovita",50000));//4
        list.add(new employee("Isha Parasu",40000));//5
        list.add(new employee("Darathi",37000));//6
        list.add(new employee("Amsavarthan",100000));//7
        list.add(new employee("Aako",60000));//8
        list.add(new employee("Ram",37000));//9
        list.add(new employee("Aravinth Vimal",55000));//10
        list.add(new employee("Sorna",42000));//11
        list.add(new employee("Guru Priya Dharshini",35000));//12
        list.add(new employee("Jeya Roshini",48000));//13
        list.add(new employee("Sathya",33000));//14
        list.add(new employee("Naseeha Shyma",45000));//15
        list.add(new employee("Bhavadharani",52000));//16
        list.add(new employee("Nithila Pallete",70000));//17
        list.add(new employee("Divya Sri",44000));//18
        list.add(new employee("Raji Santhoshi",62000));//19
        list.add(new employee("Jane Nivethitha",72000));//20
        System.out.println("List:"+list);
        Collections.sort(list,new namesort());
        System.out.println("**********************************");
        System.out.println("Sorted list in descending order of names:");
        System.out.println(list);       
        
    }
    
}

class employee
{
    String name;
    double salary;
    employee(String n,double s)
    {
        name=n;
        salary=s;
    }
    public String toString()
    {
        return "\nName:"+name+"\tSalary:Rs."+salary;
    }
}

class namesort implements Comparator<employee>
{
    public int compare(employee e1,employee e2)
    {
        return e2.name.compareTo(e1.name);
    }
}