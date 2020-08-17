/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_4.main_class_of_two_programs;
import Lab_ex_4.firstpackage.*;
import Lab_ex_4.secondpackage.*;
import Lab_ex_4.secondpackage.subpackage.*;
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
