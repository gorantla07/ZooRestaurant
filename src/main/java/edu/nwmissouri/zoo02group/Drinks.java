/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package edu.nwmissouri.zoo02group;

/**
 *
 * @author Tejaswini Challa
 */
public enum Drinks {

    /**
     * 
     */
    FOUNTAIN_SODA_20_OZ(2.99),

    /**
     *
     */
    RED_BULL(4.29),

    /**
     *
     */
    IZZE_SPARKLING_JUICE(2.79),

    /**
     *
     */
    FRESH_BREWED_ICED_TEA(2.99),

    /**
     *
     */
    WATER(0.00);
    private final double drinkPrice;

    private Drinks(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    /**
     *
     * @return drinkPrice
     */
    public double getDrinkPrice() {
        return drinkPrice;
    }
}
