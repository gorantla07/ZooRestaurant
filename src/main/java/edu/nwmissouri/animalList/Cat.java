package edu.nwmissouri.animalList;


/**
 *
 * @author Maneesh Sake
 */
public class Cat extends Animal {

    public Cat(String name) {
        super(name);

    }

    @Override
    public void speak() {
        System.out.println(" I am a Cat.. " + this.name);
    }

    @Override
    public void move() {
        System.out.println(" I can run faster");

    }
    
    public void profess() {
        double a = 2.5;
        int b = 2;
        double c = getCatAddition(a, b);
        System.out.printf("I know AardvarkAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    }

    /**
     * Custom Aardvark function - your class must use a unique function name
     * unique first parameter identifier unique second parameter identifier do
     * something creative
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
     public double getCatAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

   

}

    
    
