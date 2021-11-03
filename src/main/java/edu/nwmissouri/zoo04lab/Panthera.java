
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *This Class extends Animal class
 * @author Pinninti Harshika
 */
public class Panthera extends Animal {

    /**
     * This is parameter constructor which initialize the instance variables
     * according to parameters passed
     *
     * @param name is passed to the constructor super constructor is used
     */
    public Panthera(String name) {
        super(name);
    }
    /**
     * Usage of enums
     */
    public enum Gender{
        Male,
        Female,
        Unknown
    }
    /**
     * This is speak method which is used to to print the message print the
     * statement
     */
    @Override
    public void speak() {
        System.out.println("I am Panthera");
    }

    /**
     * This is move method which is used to to print the message print the
     * statement that describes the Panther movements
     */
    @Override
    public void move() {
        System.out.println("I can eat and walk");
    }
    /**
    * This method prints the logarithm value of a number
    *prints the logaithm value 
    */
    public void logarithm(){
        double x=Math.log(5);
        System.out.println("Logarithm value of two numbers is:"+x);
    }
    /**
    * This method prints the multiplication of two numbers 
    *prints the Multiplication value 
    */
    public void multiplication(int a, int b){
        int c=a*b;
        System.out.println("The multiplication of two numbers is: " +c);
    }
    /**
    * adds the two numbers 
    * @return double value
    */
    public double getPantheraAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

  public static void main(String args[]){
      var d=new Panthera("Harshika");
      d.speak();
      d.move();
      d.multiplication(3, 5);
      d.logarithm();
     Gender c1 = Gender.Male;
     System.out.println("The Gender of the Panthera is: "+c1);
     
  }
}
