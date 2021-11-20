/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.animalList;


/**
 * Gerenuk class (derived subclass of the superclass Animal)
 *
 * @author Tejaswini Challa
 */
public class Gerenuk extends Animal {
   
    /**
     * Gerenuk constructor
     *     
     * @param name - the name of this Gerenuk
     */
   public Gerenuk(String name)
   {
      super(name);
   }
    @Override
   public void speak()
    {
        System.out.printf("I'm %s. I'm an Aardvark!", this.name);
    }
   @Override
   public void move()
   {
       System.out.println("I can move with four legs");
   }
  
    public void size()
    {
        System.out.println("140 to 160 CENTIMETERS");
    }
    public void place()
    {
        System.out.println("Exists in Kenya");
    }
  public int Exceptionclass() {
        int b = 10;
        for (int i = 3; i >= 0; i--)
		   try {
            System.out.println(b / i);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return b;
    }
    
    public static void main(String[] args) {
        Gerenuk g = new Gerenuk("g");
        g.speak();
        g.move();
        g.Exceptionclass();
    }

    


}
