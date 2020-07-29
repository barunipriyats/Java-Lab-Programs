/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Baruni Priya T S
 */
public class Sum_of_numbers {
    public static void main(String[] args) {
        int i,n,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the limit");
        n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of numbers is "+sum);
    }
    
}
