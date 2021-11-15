/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package edu.nwmissouri.zoo02group;

/**
 * enum for Items list and setting the prizes to
 * @author Tejaswini Challa
 */
public enum Items {

    /**
     *
     */
    VEG_BIRYANI(9.99),

    /**
     *
     */
    CHICKEN_BIRYANI(10.49),

    /**
     *
     */
    ROTTI(14.49),

    /**
     *
     */
    PRAWNS_BIRYANI(13.49),

    /**
     *
     */
    Afghini_chicken(10.29);
    private final double ITEMPRICE;

    private Items(double ITEMPRICE) {
        this.ITEMPRICE = ITEMPRICE;
    }

    /**
     *
     * @return ITEMPRICE
     */
    public double getItemPrize() {
        return ITEMPRICE;
    }
    
}
