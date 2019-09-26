/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise5;


public class Square extends Rectangle{
    
    Square(){
        
    }
    
    Square(double side){
        super(side, side);
    }
    
    Square(double side, String color, boolean filled){
        
    }
    
    public double getSide(){
        return super.getLength();
    }
    
    public void setSide(double side){
        super.setLength(side);
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }
    
    @Override
    public void setLength(double side){
        super.setLength(side);
    }
    
    @Override
    public String toString() {
        return String.format("A Square with side=%f, which is a subclass of %s", getSide(), super.toString());
    }
}
