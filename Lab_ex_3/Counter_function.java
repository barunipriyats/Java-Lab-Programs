/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_3;

/**
 *
 * @author Baruni Priya T S
 */
public class Counter_function {
    public static void main(String[] args) {
        System.out.println("Without static variable:");
        without_static w=new without_static();
        without_static w1=new without_static();
        without_static w2=new without_static();
        
        System.out.println("With static variable:");
        with_static w3=new with_static();
        with_static w4=new with_static();
        with_static w5=new with_static();
    }    
}

class without_static
{
    int num=0;
    without_static()
    {
        num++;
        System.out.println(num);
    }
}

class with_static
{
    static int num=0;
    with_static()
    {
        num++;
        System.out.println(num);
    }
}