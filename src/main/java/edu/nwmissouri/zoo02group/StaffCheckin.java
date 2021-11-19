/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo02group;

import edu.nwmissouri.animalList.visitAnimals;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * choosing type of checking based upon staff interest
 * @author Pavan Kumar Atmakuri
 */
public class StaffCheckin {
    private static  ArrayList<OrderedItem> itemOrders=new ArrayList<>();
    private static  ArrayList<OrderedDrink> drinkOrders= new ArrayList<>();

   /**
    * 
    * @return itemOrder List 
    */
    public static ArrayList<OrderedItem> getItemOrders() {
        return itemOrders;
    }
    /**
     * 
     * @return drinkOrders List
     */
    public static ArrayList<OrderedDrink> getDrinkOrders() {
        return drinkOrders;
    }

    public static void setItemOrders(ArrayList<OrderedItem> itemOrders) {
        StaffCheckin.itemOrders = itemOrders;
    }

    public static void setDrinkOrders(ArrayList<OrderedDrink> drinkOrders) {
        StaffCheckin.drinkOrders = drinkOrders;
    }
    

    public StaffCheckin() {
    }
    /**
     * 
     * @param id getting staff Id
     * @param n type of entered person
     */
    public void chooice(int id,int n) {

        Scanner s = new Scanner(System.in);
        try{
        int ch;
        do {
            System.out.println("what you want to see\n1. visit the animals\n2. Food court\n3. List visitors Data\n4. exit");
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
                case 3 ->{
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println(String.format("%-20s", "VISITERID")+""+String.format("%-30s", "NAME")+""+String.format("%-10s", "AGE")+""+String.format("%-20s", "GENDER"));
                    System.out.println("----------------------------------------------------------------------");
                    for(Visitor v:Visitor.getVisitorList()){
                        System.out.println(String.format("%-20s", v.getVisitorId())+""+String.format("%-30s", v.getFirstName()+" "+v.getLastName())+""+String.format("%-10s", v.getAge())+""+String.format("%-20s", v.getGender()));
                    }
                    System.out.println("----------------------------------------------------------------------");
                
            }
                case 4 -> {
                    Billing b = new Billing();
                    b.findCost();
                    System.out.println(b.printBill(id,n));
                   
                }
            }
        } while (ch != 4);

    }
    catch (Exception e) {
            System.out.println("Exception class name:" + e.getClass());
            System.out.println("Expection message: "+ e.getMessage());
        }
}
    
}
