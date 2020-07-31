/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class Arithmetic_operations {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the first number");
        int first=a.nextInt();
        System.out.println("Enter the second number");
        int second=a.nextInt();
        art obj=new art();
        System.out.println("Arithmetic operations are shown below");
        obj.add(first,second);
        obj.sub(first,second);
        obj.mul(first,second);
        obj.div(first,second);
    }
}

class art {
    void add(int a,int b) {
        System.out.println("Addition:"+(a+b));
    }
    void sub(int a,int b) {
        System.out.println("Subtraction:"+(a-b));
    }
    void mul(int a,int b) {
        System.out.println("Multiplication:"+(a*b));
    }
    void div(int a,int b) {
        System.out.println("Division:"+(a/b));
    }
}