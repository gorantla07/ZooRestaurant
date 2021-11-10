/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 * This is lioness class which is extended from Animal Class
 *
 * @author Sreebharath Mallampati
 */
public class Lioness extends Animal {

    /**
     * Constructor
     *
     * @author Sreebharath Mallampati
     */
    Lioness(String name) {
        super(name);
    }

    /**
     * This is a speak method
     *
     * @author Sreebharath Mallampati
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s and I belong Lion family.", this.name);
    }

    /**
     * This method is used to print the moving nature
     *
     * @author Sreebharath Mallampati
     */
    @Override
    public void move() {
        System.out.println("When I move, I hunt, hunt, hunt.\n");
    }

}
