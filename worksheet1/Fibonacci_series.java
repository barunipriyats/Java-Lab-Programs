/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;

/**
 *
 * @author Baruni Priya T S
 */
public class Fibonacci_series {
    public static void main(String[] args) {
        int a=-1,b=1,c;
        System.out.println("Fibonacci series:");
        for(int i=0;i<10;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        
    }
}
