/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_4.main_class_of_two_programs;
import to_kilometer.*; 
import to_miles_meter.*;
/**
 * @author Baruni Priya T S
 */
public class Conversion {
    public static void main(String[] args) {
        System.out.println("Distance converter");
        from_miles_meter_to_kilometer obj=new from_miles_meter_to_kilometer();
        obj.k();
        from_kilometer_to_miles_meter obj1=new from_kilometer_to_miles_meter();
        obj1.m();
    }
}
