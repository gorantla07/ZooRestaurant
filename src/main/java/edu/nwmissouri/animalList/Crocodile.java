package edu.nwmissouri.animalList;
/**
 * Crocodile class derived subclass of the  super class animal
@author  ruthvik bhairav (S545261)
**/

public class Crocodile extends Animal {
        public Crocodile(String name){
         super(name);
    }
    
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an Crocodile!", this.name);
    }
    
    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }
     public void profess() {
        double a = 2.5;
        int b = 2;
        double c = getCrocodileAddition(a, b);
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
    public double getCrocodileAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

   
    
}

