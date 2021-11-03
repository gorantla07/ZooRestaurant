package edu.nwmissouri.zoo04lab;

import java.util.ArrayList;

/**
 *Provides methods to create and run a group of Asps
 * @author Priyanka Maruthi
 */
public class AspGroup {
private static ArrayList<Asp> myGroup;

    /**
     * Create a static group of Asp
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Asp a = new Asp("python");
        myGroup.add(a);
        myGroup.add(new Asp("venom"));
        myGroup.add(new Asp("Carl"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("*****************************************");
        System.out.println("Hey - look at the Asp!");
        myGroup.forEach(asp -> {
            asp.speak();
            asp.move();
        });
        System.out.println("Nice Asp - that was fun!");
        System.out.println("*****************************************");
    
}}
