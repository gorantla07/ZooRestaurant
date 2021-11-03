/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package edu.nwmissouri.zoo02group;

/**
 *
 * @author Pavan Kumar Atmakuri
 */
public enum Items {
    Veg_Biriyani(9.99),
    Chicken_Biriyani(10.49),
    Rotti(14.49),
    prawls_Biriyani(13.49),
    Afghini_chicken(10.29);
    private final double itemPrize;

    private Items(double itemPrize) {
        this.itemPrize = itemPrize;
    }

    public double getItemPrize() {
        return itemPrize;
    }
    
}
