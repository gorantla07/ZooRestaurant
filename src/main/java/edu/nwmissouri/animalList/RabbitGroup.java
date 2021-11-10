package edu.nwmissouri.animalList;

import java.util.ArrayList;

/** 
 *This is Rabbit Group which defines the Rabbit class
 * @author Keerthana Ragut (s545031)
 */
public class RabbitGroup {
    
    private static ArrayList<Rabbit> myGroup;
    
     public static int create() {
        myGroup = new ArrayList<>();

        myGroup.add(new Rabbit("Tom"));
        myGroup.add(new Rabbit("Jerry"));
        myGroup.add(new Rabbit("Poo"));

        return myGroup.size();
    }

    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the rabbit!!!!");
        for (Rabbit rabbit : myGroup) {
            rabbit.speak();
            rabbit.move();
        }

        System.out.println("Nice Rabbits - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
