/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author SureshTRD
 */
public class Valid_or_not_valid_checking {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Press a key");
        int a=obj.nextInt();
        switch(a)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("You pressed : "+a);
                break;
            default:
                System.out.println("You pressed an incorrect option i.e. "+a);
             
        }
    }
    
}
