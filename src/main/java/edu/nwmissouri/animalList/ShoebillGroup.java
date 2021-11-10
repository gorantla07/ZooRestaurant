package edu.nwmissouri.animalList;
import java.util.ArrayList;


/**
 * Provides methods to create and run a group of Shoebills
 * @author Gayatri Devabhaktuni
 */
public class ShoebillGroup {
     private static ArrayList<Shoebill> myGroup;
     
     public static int create() {
        myGroup = new ArrayList<>();

        myGroup.add(new Shoebill("Mike"));
        myGroup.add(new Shoebill("Afro"));
        myGroup.add(new Shoebill("Sasha"));

        return myGroup.size();
    }
      public static void run() {
        System.out.println("------------------------------------------");
        System.out.println("Hey - look at the Shoebill!");
        for (Shoebill shoebill : myGroup) {
            shoebill.speak();
            shoebill.move();
        }

        System.out.println("Nice Shoebill - that was fun!");
        System.out.println("---------------------------------------");
    }
    
}
