/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid;
public class DVD extends ProductPart2{
    
    private String movieTitle;
    private double length;
    
    
    public DVD(){
        
        movieTitle=null;
        length=0.00;
        
    }
    
    public DVD(String movie, double hour){
        
        movieTitle=movie;
        length=hour;
        
    }
    
    
    public double calcuteValue(int numberOfUnits,double unitPrice){
        
        double value1,value;
        value1=unitPrice*numberOfUnits;
        value=value1+value1*0.05;
   
        return value;
    
    
    }
    
    public String toString(){
        
        String description;
        
        description=String.format(super.toString()+movieTitle+length);
        
        
        return description;
    }
    
    
    
    
}
