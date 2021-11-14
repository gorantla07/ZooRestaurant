package edu.nwmissouri.animalList;


/**
 * This class defines the nature of the Puma animal
 * @author Sai Kaushik Beeram (S545124)
 */
public class Puma extends Animal {
    
    //Declaration of string name
    
    public Puma(String name){
        super(name);
        
    }
    /**
     * Determines the animal speak
     */
    @Override
    public void speak(){
        System.out.printf("I'm %s. I'm an Puma!", this.name);
    }
    /**
     * Determines the animal move
     */
    @Override
    public void move(){
        System.out.println("Puma movement");
    }
    /**
     * This method will initialize the values and calls the sum method
     */
    public void calculation() {
        double a = 2.5;
        int b = 2;
        double c = getPumaAddition(a, b);
        System.out.printf("I know PumaAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }
    /**
   * This method will calculate the sum of two numbers
   * @param valueOne double value which is passed from sumOfTwo() 
   * @param valueTwo int value which is passed from sumOfTwo()
   * @return it returns the sum of two numbers
   */
    public double getPumaAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }


    double getPumacalculation(double first, int second) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 }
