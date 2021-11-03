package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;


/**
 * Provides methods to create and run a group of HarpSeals
 * @author Rehana Naguru
 */
public class HarpSealGroup {
     private static ArrayList<HarpSeal> myGroup;

    /**
     * Create a static group of HarpSeal
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        HarpSeal a = new HarpSeal("Harpie");
        myGroup.add(a);
        myGroup.add(new HarpSeal("Sweety"));
        myGroup.add(new HarpSeal("Seal"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */ 
    public enum Animals {
       Cow,
       HarpSeal,
       Walrus,
       Duck;
    }
    public static void run() {
        System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        System.out.println("Look at the HarpSeal!");
        myGroup.forEach(HarpSeal -> {
            HarpSeal.speak();
            HarpSeal.move();
            HarpSeal.funfacts();
            HarpSeal.location();
            HarpSeal.food();
            HarpSeal.calculate();
        });
        System.out.println("Nice HarpSeal - that was fun!");
        System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \n"); 
        
         Animals ani = Animals.HarpSeal; 
        switch(ani) {
            case Cow: 
             
                System.out.println("***********Thank you for your choice of Cow*********");
                System.out.println("____________________________________________________");
                break;
            case HarpSeal: 
                System.out.println("____________________________________________________");
                System.out.println("|*******Thank you for your choice of HarpSeal*******|");
                System.out.println("____________________________________________________");
                break;
            case Walrus: 
                System.out.println("*******Thank you for your choice of Walrus*******");
                break;
            case Duck: 
                System.out.println("*******Thank you for your choice of Duck*******");
                break;    
        }
    }

    
}

