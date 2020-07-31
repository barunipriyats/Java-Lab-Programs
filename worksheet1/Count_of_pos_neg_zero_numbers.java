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
public class Count_of_pos_neg_zero_numbers {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of digits to be entered : ");
        int n=obj.nextInt();
        System.out.println("Enter the numbers");
        int c,pos=0,neg=0,zer=0;
        for(int i=0;i<n;i++)
        {
            c=obj.nextInt();
            if(c>0)
                pos++;
            else if(c<0)
                neg++;
            else
                zer++;
        }
        System.out.println("Count of positive numbers : "+pos+"\nCount of negative numbers : "+neg+"\nCount of zero : "+zer);
    }
}
