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
public class OrderedItem {
    private Items itemName;
    private ArrayList<OrderedItem> itemOrders=new ArrayList<>();
    public OrderedItem(Items itemName) {
        this.itemName = itemName;
    }
 
   

    public Items getItemName() {
        return itemName;
    }

    public void setItemName(Items itemName) {
        this.itemName = itemName;
    }

    
    
}
