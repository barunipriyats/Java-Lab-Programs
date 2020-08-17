/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_4.to_kilometer;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class from_miles_meter_to_kilometer {
    public void k()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Converting meter to kilometer:");
        System.out.println("Enter the meter:");
        double meter=obj.nextInt();
        double kilometer=meter/1000;
        System.out.println(meter+" meter="+kilometer+" kilometer");
        System.out.println("Converting miles to kilometer:");
        System.out.println("Enter the miles:");
        double miles=obj.nextInt();
        double kilometer1=miles*1.609344;
        System.out.println(miles+" miles="+kilometer1+" kilometer");
    }
    
}
