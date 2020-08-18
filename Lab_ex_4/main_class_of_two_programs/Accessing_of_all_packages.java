/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_class_of_two_programs;
import firstpackage.*;
import secondpackage.*;
import secondpackage.subpackage.*;
/**
 *
 * @author Baruni Priya T S
 */
public class Accessing_of_all_packages {
    public static void main(String[] args) {
        firstclass f=new firstclass();
        f.first();
        secondclass s=new secondclass();
        s.second();
        thirdclass t=new thirdclass();
        t.third();
    }
}
