/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid;

import java.util.Arrays;
import java.util.Scanner;
public class ProductTesterPart2 {

    public static void main(String[] args) {
        
        
        
        Scanner input=new Scanner(System.in);
        
        int numOfProducts,qty,itemNo,addItems,deductItems,stock;
        String name;
        double value,unitPrice;
        char response;
       
        System.out.printf("Enter the number of products you wish to add :");
        numOfProducts=input.nextInt();
        
        
        if(numOfProducts<=0)
            
            numOfProducts=0;
        
       
        
        else{
            
            
          for(int i=0;i<numOfProducts;i++){
            
            DVD[] D=new DVD[5];
        
                
              D[0]=new DVD();
              D[1]=new DVD("Games of thrones",1.30);
              D[2]=new DVD("Princess",1.20);
              D[3]=new DVD("Baby",3.00);
              D[4]=new DVD("Yoga",1.10);
               
               System.out.println("Enter the Item Number :");
               itemNo=input.nextInt();
               D[i].setItemNumber(itemNo);
               
               System.out.println("Enter the Item Name :");
               name=input.next();
               D[i].setName(name);
               
               
               System.out.println("Enter the quantity:");
               qty=input.nextInt();
               D[i].setNumberOfUnits(qty);
               
               System.out.println("\nEnter the Unit Price :");
               unitPrice=input.nextDouble();
               D[i].setUnitPrice(unitPrice);
              
             
               
      
                
                
               System.out.println("If you want to add the items to your list?? Then press  A\n");
               System.out.println("If you want to deduct the items from your list?? Then press  K\n");
               response=input.next().charAt(0);
               
               
               
               if(response=='A'){
                   
                   System.out.println("how many items that you want to add??");
                   addItems=input.nextInt();
               
                    stock=ProductPart2.addUnitsToStock(addItems,qty);
                    
                           
                   
                   
               }
               
               else if(response=='K'){
                   
                   System.out.println("how many items that you want to deduct??");
                   deductItems=input.nextInt();
               
                   
                   stock=ProductPart2.deductUnitsToStock(deductItems,qty);
                   qty-=stock;
                   
                   
               }
               
    
               System.out.println(Arrays.toString(D));
              
               
               
               
               
                   }
                   
 
    
            }
            
            
           
            
           
            
        }
       
        
        
        
        
        
        
    }
    