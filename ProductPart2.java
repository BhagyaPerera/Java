/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid;

/**
 *
 * @author BHAGYA
 */
public class ProductPart2 {
    
    
    
    
    private int itemNumber;
    private String name;
    private int numberOfUnits;
    private double unitPrice;
    private static int stock;

   
    
    public ProductPart2(){
        
        itemNumber=0;
        name=null;
        numberOfUnits=0;
        unitPrice=0.00;
        stock=0;
        
        
    }
    
    public ProductPart2(int itemNumber,String name,int numberOfUnits,double unitPrice){
        
        this.itemNumber=itemNumber;
        this.name=name;
        this.numberOfUnits=numberOfUnits;
        this.unitPrice=unitPrice;
        
        
    }
    
    
    public void setItemNumber(int itemNo){
        
        itemNumber=itemNo;
 
        
    }


    public int getItemNumber(){
        
        return itemNumber;

        
    }

     public void setName(String name){
        
        this.name=name;
 
        
    }


    public String getName(){
        
        return name;

        
    }

     public void setNumberOfUnits(int qty){
        
        numberOfUnits=qty;
 
        
    }


    public int getNumberOfUnits(){
        
        return numberOfUnits;

        
    }

    
     public void setUnitPrice(double unitPrice){
        
        this.unitPrice=unitPrice;
 
        
    }


    public double getUnitPrice(){
        
        return unitPrice;

        
    }

    
    public static int addUnitsToStock(int numberOfItemstoAdd,int qty){
        
        
       stock=qty+numberOfItemstoAdd;
       return stock;
    
    }
    
    public static int deductUnitsToStock(int numberOfItemstoDeduct,int qty){
        
       
       stock=qty-numberOfItemstoDeduct;
       return stock;
    
    }
    public double calcuteValue(int numberOfUnits,double unitPrice){
        
        double value;
        value=unitPrice*numberOfUnits;
   
      return value;
    }
    
    

    public String toString(){
        
        String description;
        
        description=String.format("\n%d      %s       %d      %.2f    %.2f\n",itemNumber,name,numberOfUnits,unitPrice);
        
        
        return description;
    }
    
   
    
    
    
    
    
    
    
}
