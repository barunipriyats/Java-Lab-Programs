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
public class Minimum_of_2_numbers {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first=obj.nextInt();
        System.out.println("Enter the second number");
        int second=obj.nextInt();
        int result=(first<second)?first:second;
        System.out.println(result+" is the minimum number");
    }
}
