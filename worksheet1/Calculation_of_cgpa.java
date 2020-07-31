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
public class Calculation_of_cgpa {
    public static void main(String[] a) {
        Scanner obj=new Scanner(System.in);
        double m[]=new double[10];
        double c[]=new double[10];
        double sum=0,csum=0;
        int i;
        System.out.println("Enter the number of subjects");
        int n=obj.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter grade and credit for "+(i+1)+" Subject");
            m[i]=obj.nextDouble();
            c[i]=obj.nextDouble();
            sum=sum+m[i]*c[i];
            csum=csum+c[i];
        }
        System.out.println("CGPA is "+(sum/csum));
    }
}
