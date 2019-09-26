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
public abstract class Shape {
    protected String color;
    protected boolean filled;
    
    Shape(){
        this.color = "green";
        this.filled = true;
    }
    
    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return this.filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    @Override
    public String toString() {
        return String.format("A Shape with color of %s and %s", this.color, (this.filled == true)? "filled":"Not filled");
        
    }
}
