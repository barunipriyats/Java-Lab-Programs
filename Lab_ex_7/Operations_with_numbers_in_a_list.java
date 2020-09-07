/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class Operations_with_numbers_in_a_list {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int in;
        System.out.println("Enter the 10 list elements:");
        ArrayList<Integer> list=new ArrayList<>(10);//creating an ArrayList
        for(int i=0;i<10;i++)
        {
            in=obj.nextInt();//input the elements from the user
            list.add(in);//adding the elements to the list
        }
        /*list.add(1811);
        list.add(300);
        list.add(257);
        list.add(2210);
        list.add(178);
        list.add(1907);
        list.add(2203);
        list.add(206);
        list.add(922);
        list.add(701);
*/
        System.out.println("List:"+list);//printing the list
        double total=0;
        for(int i=0;i<10;i++)
        {
            total=total+list.get(i);//finding the sum of all numbers
        }
        double average;//finding the average of all numbers
        average=total/10;
        System.out.println("Average of all numbers in the list:"+average);//printing the average of all numbers
        System.out.println("Lowest number:"+Collections.min(list));//printing the smallest number
        System.out.println("Highest number:"+Collections.max(list));//printing the largest number
        list.removeIf((Integer l)->l%2==0);//filters out all the even numbers(ones place divisble by 2 is same as the entire number divisible by 2)
        System.out.println("Updated list:"+list);//printing the list
    }
}

