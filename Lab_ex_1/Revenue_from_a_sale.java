/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_1;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class Revenue_from_a_sale {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        double discount;
        System.out.println("Enter the unit price:");
        double unitprice=o.nextDouble();
        System.out.println("Enter the quantity:");
        double quantity=o.nextDouble();
        double revenue=quantity*unitprice;
        System.out.println("Revenue from sale:"+revenue);
        if(quantity>=100 && quantity<=120)
            discount=(revenue*10)/100;
        else if(quantity>120)
            discount=(revenue*15)/100;
        else
            discount=revenue;
        System.out.println("After discount:"+discount);
        
            
        
    }
}
