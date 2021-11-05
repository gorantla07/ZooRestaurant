/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo02group;

import java.util.ArrayList;

/**
 *
 * @author Tejaswini Challa
 */
public class Billing {
    private static double total_price=0.0;
    Checkin check=new Checkin();

    /**
     *
     */
    public static double enterfee=0.00;

    /**
     *
     */
    public Billing(){}

    /**
     *
     * @return total_price
     */
    public double getTotal_price() {
        return total_price;
    }

    /**
     *
     * @param tp
     */
    public void setTotal_price(double tp) {
        this.enterfee=tp;
        this.total_price += tp;
    }

    /**
     * calculating total price
     */
    public void findCost(){
        
        
        for(OrderedDrink o:check.getDrinkOrders()){
            this.total_price+=o.getDrinkName().getDrinkPrice();
        }
        
        for(OrderedItem o1:check.getItemOrders()){
            this.total_price+=o1.getItemName().getItemPrize();
        }
        
    }

    /**
     * Returning bill formate 
     * @param id
     * @return s Bill formate returning 
     */
    public String printBill(int id,int n){
       String s="";
       Checkin c=new Checkin();
       if(n==1){
       for(Visitor v:Visitor.getVisitorList())
       {
           if(v.getVisitorId()==id)
           {
               s=s+"-------------------------------------------------------\n\t\t     Visitor Details\n-------------------------------------------------------\n"+v.toString()+"\n";
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
        s=s+"-------------------------------------------------------\nTotal Price:\t\t\t     "+Math.round(total_price*100.0)/100.0+"\n-------------------------------------------------------";
       }
       if(n==2){
           for(Staff st:Staff.getStaffList()){
               if(st.getStaffId()==id){
                   s=s+"-------------------------------------------------------\n\t\t     Staff Details\n-------------------------------------------------------\n"+st.toString()+"\n";
               }
           }
           s=s+"-------------------------------------------------------\n"+String.format("%-35s","SELECTED ITEMS")+"PRICES\n-------------------------------------------------------\n"
               +String.format("%-35s", "ENTRANCE FEE")+""+this.enterfee+"\n";
       for(OrderedItem o:StaffCheckin.getItemOrders()){
            s=s+String.format("%-35s", o.getItemName())+""+o.getItemName().getItemPrize()+"\n";
            this.total_price+=o.getItemName().getItemPrize();
        }
        for(OrderedDrink o:StaffCheckin.getDrinkOrders()){
            s=s+String.format("%-35s",o.getDrinkName())+""+o.getDrinkName().getDrinkPrice()+"\n";
            this.total_price+=o.getDrinkName().getDrinkPrice();
            
        }
        s=s+"-------------------------------------------------------\nTotal Price:\t\t\t     "+Math.round(total_price*100.0)/100.0+"\n-------------------------------------------------------";
       }
        return s;
   }
    
}
