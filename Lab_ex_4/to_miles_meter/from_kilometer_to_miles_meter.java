/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package to_miles_meter;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class from_kilometer_to_miles_meter {
    public void m()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Converting kilometer to meter:");
        System.out.println("Enter the kilometer:");
        double kilo=obj.nextInt();
        double meter=kilo*1000;
        System.out.println(kilo+" kilometer="+meter+" meter");
        System.out.println("Converting kilometer to miles:");
        System.out.println("Enter the kilometer:");
        double kilo1=obj.nextInt();
        double miles=kilo/1.609344;
        System.out.println(kilo+" kilometer="+miles+" miles");
    }
    
}
