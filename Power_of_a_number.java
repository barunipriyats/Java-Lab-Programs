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
public class Power_of_a_number {
    public static void main(String[] args) {
        int n,p;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the base number:");
        n=obj.nextInt();
        System.out.println("Enter the power number");
        p=obj.nextInt();
        int sum=1;
        for(int i=0;i<p;i++)
        {
            sum=sum*n;
        }
        System.out.println("Power of "+n+" ^ "+p+" is "+sum);
    }
    
}
