/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise5;


public class Exercise5 {

    public static void main(String[] args) {
        Shape shp = new Shape();
        String clr = shp.getColor();
        boolean fld = shp.isFilled();
        System.out.println(shp.toString());
        System.out.println(clr);
        System.out.println(fld);
        shp.setColor("blue");
        shp.setFilled(false);
        System.out.println(shp.toString());
    }  
}
