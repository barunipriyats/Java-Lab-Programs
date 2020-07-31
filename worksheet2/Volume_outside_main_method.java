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
public class Volume_outside_main_method {
    public static void main(String[] args) {
        volumeout obj=new volumeout();
        obj.depth=10;
        obj.height=20;
        obj.width=30;
        obj.volu();
        volumeout obj1=new volumeout();
        obj1.depth=12;
        obj1.height=34;
        obj1.width=56;
        obj1.volu();
    }
}

class volumeout
{
    double height,width,depth;
    public void volu()
    {
        double vol;
        vol=height*width*depth;
        System.out.println("Volume:"+vol);
    }
}