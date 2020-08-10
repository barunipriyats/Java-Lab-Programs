/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_3;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class Static_mean {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num=obj.nextInt();
        double array[]=new double[num];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<num;i++)
            array[i]=obj.nextDouble();
        mean(array,num);
    }
    static void mean(double array[],int num)
    {   
        double sum=0,average=0;
        for(int i=0;i<num;i++)
        {
            sum=sum+array[i];
        }
        average=sum/num;
        System.out.println("Mean of the array:"+average);
    }
}
