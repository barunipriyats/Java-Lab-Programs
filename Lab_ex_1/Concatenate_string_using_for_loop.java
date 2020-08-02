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
public class Concatenate_string_using_for_loop {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=obj.nextInt();
        String str="";
        for(int i=1;i<=num;i++)
        {
            str=str+i+" ";
        }
        System.out.println("Output:"+str);
    }
}
