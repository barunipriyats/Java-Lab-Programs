/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class Breaking_of_digit {
     public static void main(String[] args){
        int n,d,i=0;
        int a[]=new int[10];
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the digit:");
        n=obj.nextInt();
        while(n>0)
        {
            d=n%10;
            a[i]=d;
            n=n/10;
            i++;
        }
        System.out.println("Splitted digits are:");
        for(int j=i-1;j>=0;j--)
            System.out.println(a[j]);
        }
}
