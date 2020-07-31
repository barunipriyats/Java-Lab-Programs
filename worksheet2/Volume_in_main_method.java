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
public class Volume_in_main_method {
    public static void main(String[] args) {
        volumein obj=new volumein();
        obj.depth=10;
        obj.height=20;
        obj.width=30;
        double vol=obj.depth*obj.height*obj.width;
        System.out.println("volume:"+vol);
    }
}

class volumein
{
    double height,width,depth;
}