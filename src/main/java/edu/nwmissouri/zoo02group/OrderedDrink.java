/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo02group;

import java.util.ArrayList;

/**
 *
 * @author Sandhya Nidigonda
 */
public class OrderedDrink {
    private Drinks drinkName;
     private ArrayList<OrderedDrink> drinkOrders= new ArrayList<>() ;
    public OrderedDrink(Drinks drinkName) {
        this.drinkName = drinkName;
    }
   
/**
 * 
 * @return ordered drinks
 */
    public Drinks getDrinkName() {
        return drinkName;
    }
/**
 * 
 * @param drinkName 
 */
    public void setDrinkName(Drinks drinkName) {
        this.drinkName = drinkName;
    }

  
    
    
}
