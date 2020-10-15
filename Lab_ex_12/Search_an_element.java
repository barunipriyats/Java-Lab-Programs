/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_12;
import java.util.Scanner;
/**
 *
 * @author Baruni Priya T S
 */
public class Search_an_element {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Integer[] dates={18,22,2,19,17,25,20,1,7};
        String[] names_list={"Baruni","Priya","Geminika","Muthu","Guru","Jovita","Jeya","Roshini"};
        Double[] floating_numbers={18.34,111.33456,23.00,1434.100,098.7654321};
        Character[] subject_topic={'o','o','p','s','p','r','o','g','r','a','m','m','i','n','g'};
        Float[] subject_marks={97.9f,88f,34f,91.23f,88.00f,85.58f};
        Check checking=new Check();
        System.out.println("Types available:\n1.Integer\n2.String\n3.Double\n4.Character\n5.Float");
        System.out.print("Press 1 for Integer type, press 2 for String type, press 3 for Double type, press 4 for Character type, press 5 for Float type :");
        int choice=obj.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Enter the date to be searched:");
                int element1=obj.nextInt();
                checking.Search(element1,dates);
                break;
            case 2:
                System.out.println("Enter the name to be searched:");
                String element2=obj.next();
                checking.Search(element2,names_list);
                break;
            case 3:
                System.out.println("Enter the floating number to be searched:");
                double element3=obj.nextDouble();
                checking.Search(element3,floating_numbers);
                break;
            case 4:
                System.out.println("Enter the subject topic to be searched:");
                char element4=obj.next().charAt(0);
                checking.Search(element4,subject_topic);
                break;
            case 5:
                System.out.println("Enter the subject mark to be searched:");
                float element5=obj.nextFloat();
                checking.Search(element5,subject_marks);
                break;
            default:
                System.out.println("Invalid input!");                
        }
    }   
}

class Check {
    boolean flag=false;
    public<T,V> void Search(T SearchValue,V[] array) {
        for(int i=0;i<array.length;i++) {
            if(SearchValue.equals(array[i])) {
                flag=true;
                break;
            }
        }
        if(flag)
            System.out.println("'"+SearchValue+"' is found in the array");
        else
            System.out.println("'"+SearchValue+"' is not found in the array");
    }
}