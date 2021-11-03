package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Jaguars
 *
 * @author Naveen Kumar Kanaparthi
 */
public class BlackJaguarGroup {

    private static ArrayList<BlackJaguar> myBlackGroup;

    /**
     * Create a static group of Jaguars
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myBlackGroup = new ArrayList<>();
        
        BlackJaguar p = new BlackJaguar("Black Jaguar 1");
        myBlackGroup.add(p);
        myBlackGroup.add(new BlackJaguar("Black Jaguar 2"));
        myBlackGroup.add(new BlackJaguar("Black Jaguar 3"));

        return myBlackGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Black Jaguar!");
        myBlackGroup.forEach(jaguar -> {
            jaguar.speak();
            jaguar.move();
        });
        System.out.println("Nice BlackJaguar - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
