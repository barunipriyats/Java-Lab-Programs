
import java.util.Scanner;

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
public class Percentage_discount {
    public static void main(String[] a)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("ENter the amount");
        double aa=obj.nextDouble();
        System.out.println("Enter the percentage");
        double aaa=obj.nextDouble();
        double aaaa=aa/100*aaa;
        System.out.println("Final rate:"+aaaa);
    }
    
}
