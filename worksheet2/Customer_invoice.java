/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet2;

/**
 *
 * @author Baruni Priya T S
 */
public class Customer_invoice {
    public static void main(String[] args) {
        customer c1=new customer(66,"Baruni",10);
        System.out.println(c1.getid());
        System.out.println(c1.getname());
        System.out.println(c1.getdiscount());
        c1.setdiscount(30);
        System.out.println(c1.getdiscount());
        System.out.println(c1);
        
        invoice in=new invoice(67,c1,2500);
        customer c2=new customer(68,"Darathi",15);
        System.out.println(in.getdata());
        System.out.println(in.getcustomer());
        System.out.println(in.getamount());
        in.setamount(30);
        in.setcustomer(c2);
        System.out.println(in.getcustomername());
        System.out.println(in.getamountafterdiscount());
    }
}
        
class customer
{
   int id;
   String name;
   int discount;
   customer(int i,String n,int d)
   {
       id=i;
       name=n;
       discount=d;
   }
   int getid()
   {
       return id;
   }
   String getname()
   {
       return name;
   }
   int getdiscount()
   {
       return discount;
   }
   void setdiscount(int d1)
   {
       discount=d1;
   }
   public String toString()
   {
       return "Name:"+name+"\nID:"+id;
   }
}
    
class invoice
{
    int id;
    customer o;
    double amount;
    invoice(int i,customer o1,double a)
    {
        id=1;
        o=o1;
        amount=a;
    }
    customer getcustomer()
    {
        return o;
    }
    int getdata()
    {
        return id;
    }
    double getamount()
    {
        return amount;
    }
    void setcustomer(customer o2)
    {
        o=o2;
    }
    void setamount(double a1)
    {
        amount=a1;
    }
    String getcustomername()
    {
        return o.name;
    }
    double getamountafterdiscount()
    {
        return amount-(amount)*o.discount/100;
    }
}
