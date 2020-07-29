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
public class Perimeter_of_a_square {
    public static void main(String[] arg){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of a square");
        int a=obj.nextInt();
        System.out.println("Perimeter of a square:"+(4*a));
    }
    
}
