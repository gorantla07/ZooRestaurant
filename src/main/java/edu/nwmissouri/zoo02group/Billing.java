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
public class Billing {
    private static double total_price=0.0;
    Checkin check=new Checkin();
    public static double enterfee=0.00;
    public Billing(){}

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double tp) {
        this.enterfee=tp;
        this.total_price += tp;
    }
    public void findCost(){
        
        
        for(OrderedDrink o:check.getDrinkOrders()){
            this.total_price+=o.getDrinkName().getDrinkPrice();
        }
        
        for(OrderedItem o1:check.getItemOrders()){
            this.total_price+=o1.getItemName().getItemPrize();
        }
        
    }

   public String printBill(int id){
       String s="";
       Checkin c=new Checkin();
       for(Visitor v:Visitor.getVisitorList())
       {
           if(v.getVisitorId()==id)
           {
               s=s+"-------------------------------------------------------\nVisitor Details\n-------------------------------------------------------\n"+v.toString()+"\n";
           }
       }
       s=s+"-------------------------------------------------------\n"+String.format("%-35s","SELECTED ITEMS")+"PRICES\n-------------------------------------------------------\n"
               +String.format("%-35s", "ENTRANCE FEE")+""+this.enterfee+"\n";
       for(OrderedItem o:check.getItemOrders()){
            s=s+String.format("%-35s", o.getItemName())+""+o.getItemName().getItemPrize()+"\n";
        }
        for(OrderedDrink o:check.getDrinkOrders()){
            s=s+String.format("%-35s",o.getDrinkName())+""+o.getDrinkName().getDrinkPrice()+"\n";
        }
        s=s+"-------------------------------------------------------\nTotal Price:\t\t\t     "+total_price+"\n-------------------------------------------------------";
       return s;
   }
    
}
