/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo02group;

import java.util.ArrayList;

/**
 *
 * @author Pavan Kumar Atmakuri
 */
public class OrderedDrink {
    private Drinks drinkName;
     private ArrayList<OrderedDrink> drinkOrders= new ArrayList<>() ;
    public OrderedDrink(Drinks drinkName) {
        this.drinkName = drinkName;
    }
   

    public Drinks getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(Drinks drinkName) {
        this.drinkName = drinkName;
    }

  
    
    
}
