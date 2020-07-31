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
public class Reverse_of_an_array {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=obj.nextInt();
        System.out.println("Enter the elements in the array");
        int a[]=new int[10];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("Reversed array : ");
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}
