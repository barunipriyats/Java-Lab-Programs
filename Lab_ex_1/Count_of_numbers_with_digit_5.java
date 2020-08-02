/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_1;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class Count_of_numbers_with_digit_5 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit=obj.nextInt();
        System.out.print("Count of numbers having 5 as a digit are ");
        count1 a=new count1();
        //obj.lim=limit;
        System.out.println(a.first(limit));
    }    
}

class count1 
{
    int lim;
    public int first(int limit)
    {
        int count=0;
        for(int i=1;i<=limit;i++)
        {
              count+=second(i);
        }
        return count;
    }
    
    public int second(int i)
    {
        int count=0;
        while(i>0)
        {
            if(i%10==5)
                count++;
            i=i/10;
        }
        return count;
    }
}