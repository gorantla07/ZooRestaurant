/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;

/**
 *
 * @author RajashekharKota
 */
public class Deer extends Animal {

    /**
     *
     * @param name
     */
    public Deer(String name) {
        super(name);
    

    }

    /**
     *
     */
    @Override
    public void speak()
    {
       System.out.println("Iam deer,Iam deer,Iam deer");
    }

    /**
     *
     */
    @Override
    public void move()
    {
       System.out.println("When i move,I run,I can run fast");
    }

    /**
     *
     */
    public void place() {
        System.out.println("It live only on land");
    }

    /**
     *
     */
    public void ismamal() {
        System.out.println("Iam a mamal");
    }

    /**
     *
     */
    public void food()
    {
       System.out.println("Feeds on plants");
    }
}
