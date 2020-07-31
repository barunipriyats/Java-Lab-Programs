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
public class Percentage_discount {
     public static void main(String[] a)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the amount");
        double aa=obj.nextDouble();
        System.out.println("Enter the percentage");
        double aaa=obj.nextDouble();
        double aaaa=aa/100*aaa;
        System.out.println("Final rate:"+aaaa);
    }
}
