/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  edu.nwmissouri.zoo04lab;
/**
 * This class is about MuleDeer extends Animal
 *
 * @author Hari Hara Mummadi
 */
public class MuleDeer extends Animal {
 // Constructor for MuleDeer
    public MuleDeer(String name) {
        super(name);
    }

    //Overriding the move
    @Override
    public void move() {
        System.out.println("I run on my 4 legs!");
    }

   //Overriding the speak
    @Override
    public void speak() {
        System.out.printf("I'm %s.I'm an Deer!\n", this.name);
    }
}
