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
public class Circle extends Shape{
    protected double radius;
    
    Circle() {
       this.radius = 1.0;
    }
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    Circle(double radius, String color, boolean filled){
        
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    } 
    
    @Override
    public double getArea() {
        return Math.PI*(Math.pow(this.radius, 2));
    }
    
    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
    
    @Override
    public String toString() {
        return String.format("A Circle with radius=%f, which is a subclass of %s", this.radius, super.toString());
    }
}
