/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise5;


public class Rectangle extends Shape {
    private double length = 1.0;
    private double width = 1.0;
            
    Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double getLength() {
        return this.length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getArea() {
        return length*width;
    }
    
    public double getPerimeter() {
        return (2*(length+width));
    }
    
    @Override
    public String toString() {
        return String.format("A Rectangle with width=%f and length=%f, which is a subclass of %s", this.width, this.length, super.toString());
    }
}
