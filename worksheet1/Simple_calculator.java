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
public class Simple_calculator {
    public static void main(String[] args) {
        int a,b;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the first value");
        a=obj.nextInt();
        System.out.println("Enter the second value");
        b=obj.nextInt();
        System.out.println("Enter the operation");
        char c=obj.next().charAt(0);
        System.out.println("Answer: ");
        switch(c)
        {
            case'+':System.out.println(a+b);
            break;
            case'-':System.out.println(a-b);
            break;
            case'*':System.out.println(a*b);
            break;
            case'/':System.out.println(a/b);
            break;
            default:
                System.out.println("Incorrect option");
        }
        
    }
    
}
