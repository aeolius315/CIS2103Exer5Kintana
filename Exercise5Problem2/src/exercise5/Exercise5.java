/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise5;

/**
 *
 * @author kintanara_cis21035
 */
public class Exercise5 {


    public static void main(String[] args) {
        Circle clr = new Circle();
        Square sqr = new Square();
        Rectangle rct = new Rectangle();
        System.out.println(clr.toString());
        System.out.println(clr.getArea());
        System.out.println(clr.getPerimeter());
        System.out.println(sqr.toString());
        System.out.println(sqr.getArea());
        System.out.println(sqr.getPerimeter());
        System.out.println(rct.toString());
        System.out.println(rct.getArea());
        System.out.println(rct.getPerimeter());
    }
    
}
