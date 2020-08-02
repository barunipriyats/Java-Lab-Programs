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
public class Odd_even_numbers_in_array {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int even=0,odd=0;
        System.out.println("Enter the size of the array:");
        int num=obj.nextInt();
        System.out.println("Enter the elements of the array:");
        int a[]=new int[10];
        for(int i=1;i<=num;i++)
        {
            a[i]=obj.nextInt();
            if(a[i]%2==0)
                even=even+a[i];
            else
                odd=odd+a[i];
        }
        System.out.println("Sum of odd numbers in the array is "+odd);
        System.out.println("Sum of even numbers in the array is "+even);
    }
}
