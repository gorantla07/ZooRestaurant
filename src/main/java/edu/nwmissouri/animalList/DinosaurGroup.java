package edu.nwmissouri.animalList;

import java.util.ArrayList;
/**
 * Provides methods to create and run a group of Dinosaurs
 *
 * @author Anurag Kolluru
 */
public class DinosaurGroup {

    private static ArrayList<Dinosaur> myDinosaurGroup;

    /**
     * Create a static group of Dinosaur
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myDinosaurGroup = new ArrayList<>();
        
        Dinosaur p = new Dinosaur("Dinosaur1");
        myDinosaurGroup.add(p);
        myDinosaurGroup.add(new Dinosaur("Dinosaur2"));
        myDinosaurGroup.add(new Dinosaur("Dinosaur3"));

        return myDinosaurGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("Roarrrrrrr....!");
        System.out.println("Hey there's a Dinosaur...!");
        myDinosaurGroup.forEach(Dinosaur -> {
            Dinosaur.speak();
            Dinosaur.move();
        });
        System.out.println("Great Dinosaur's..it was a fun ride!");
        System.out.println("Dinosaurrrrrr.....!");
    }

}
