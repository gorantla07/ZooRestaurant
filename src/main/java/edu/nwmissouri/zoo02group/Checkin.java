/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo02group;

import java.util.ArrayList;
import java.util.Scanner;
import edu.nwmissouri.zoo04lab.*;
/**
 *
 * @author Pavan Kumar Atmakuri
 */
public class Checkin {
    private static  ArrayList<OrderedItem> itemOrders=new ArrayList<>();
    private static  ArrayList<OrderedDrink> drinkOrders= new ArrayList<>();

   /**
    * 
    * @return itemOrdered List
    */
    public static ArrayList<OrderedItem> getItemOrders() {
        return itemOrders;
    }
    /**
     * 
     * @return drinkOrdered List
     */
    public static ArrayList<OrderedDrink> getDrinkOrders() {
        return drinkOrders;
    }

   
   

   
    public Checkin() {
    }
    /**
     * 
     * @param id getting visitor id
     * @param c getting type of entered
     */
    public void chooice(int id,int c) {

        Scanner s = new Scanner(System.in);
        
        int ch;
        do {
            System.out.println("what you want to see\n1. visit the animals\n2. Food court\n3. exit");
            ch = s.nextInt();

            switch (ch) {
                case 1 -> {
                    visitAnimals va=new visitAnimals();
                    va.selectedAnimal();
                }
                case 2 -> {

                    int k;
                    do {
                        System.out.println("what you want's to choose");
                        System.out.println("1. Items\n2. Drinks\n3. Type 3 for back to check in");

                        k = s.nextInt();
                        switch (k) {
                            case 1 -> {
                                System.out.println("1. Veg_Biriyani\n2. Chicken_Biriyani\n3. Rotti\n4. prawls_Biriyani\n5. Afghini_chicken");
                                System.out.println("What Item do you want");

                                int u = s.nextInt();
                                switch (u) {
                                    case 1 -> {
                                        System.out.println("hi");
                                        itemOrders.add(new OrderedItem(Items.Veg_Biriyani));
                                        
                                    }
                                    case 2 -> {
                                        itemOrders.add(new OrderedItem(Items.Chicken_Biriyani));
                                    }
                                    case 3 -> {
                                        itemOrders.add(new OrderedItem(Items.Rotti));
                                    }
                                    case 4 -> {
                                        itemOrders.add(new OrderedItem(Items.prawls_Biriyani));
                                    }
                                    case 5 -> {
                                        itemOrders.add(new OrderedItem(Items.Afghini_chicken));
                                    }
                                }
                            }
                            case 2 -> {
                                System.out.println("1. FOUNTAIN_SODA_20_OZ\n2. RED_BULL\n3. IZZE_SPARKLING_JUICE\n4. FRESH_BREWED_ICED_TEA\n5. WATER");
                                System.out.println("What type of drink do you want ");

                                int y = s.nextInt();
                                switch (y) {
                                    case 1 -> {
                                        drinkOrders.add(new OrderedDrink(Drinks.FOUNTAIN_SODA_20_OZ));
                                    }
                                    case 2 -> {
                                        drinkOrders.add(new OrderedDrink(Drinks.RED_BULL));
                                    }
                                    case 3 -> {
                                        drinkOrders.add(new OrderedDrink(Drinks.IZZE_SPARKLING_JUICE));
                                    }
                                    case 4 -> {
                                        drinkOrders.add(new OrderedDrink(Drinks.FRESH_BREWED_ICED_TEA));
                                    }
                                    case 5 -> {
                                        drinkOrders.add(new OrderedDrink(Drinks.WATER));
                                    }

                                }

                            }
                        }

                    } while (k != 3);
                }
                case 3 -> {
                    Billing b = new Billing();
                    b.findCost();
                    System.out.println(b.printBill(id,c));
                   
                }
            }
        } while (ch != 3);

    }

}
