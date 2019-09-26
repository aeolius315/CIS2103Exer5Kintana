/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise5;


public class Shape {
    private String color = "red";
    private boolean filled = true;
    
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
    
    @Override
    public String toString() {
        return String.format("A Shape with color of %s and %s", this.color, (this.filled == true)? "filled":"Not filled");
        
    }
}
