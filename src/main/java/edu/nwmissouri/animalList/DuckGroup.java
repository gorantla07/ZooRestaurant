package edu.nwmissouri.animalList;

import java.util.ArrayList;
/**
 * Provides methods to create and run a group of Duck
 * @author Sandhya Nidigonda
 */
public class DuckGroup {
    private static ArrayList<Duck> myGroup;

    /**
     * Create a static group of Duck
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        
        myGroup.add(new Duck("duckling"));
        myGroup.add(new Duck("Anas"));
        myGroup.add(new Duck("canard"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Duck!");
        myGroup.forEach(Duck -> {
            Duck.speak();
            Duck.move();
            Duck.eat();
            Duck.studentDuck();
        });
        System.out.println("Nice Duck - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }


}
