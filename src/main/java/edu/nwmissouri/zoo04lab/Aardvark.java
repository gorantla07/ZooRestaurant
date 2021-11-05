package edu.nwmissouri.zoo04lab;

/**
 * Aardvark class (derived subclass of the superclass Animal)
 *
 * @author Dr. Case
 */
public class Aardvark extends Animal {

    /**
     * Aardvark constructor
     *
     * @param name - the name of this aardvark    
     */
    public Aardvark(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an Aardvark!", this.name);
    }

    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }

    public void profess() {
        double a = 2.5;
        int b = 2;
        double c = getAardvarkAddition(a, b);
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
    public double getAardvarkAddition(double valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public static void main(String[] args) {
        var a = new Aardvark("Tester");
        a.speak();
        a.move();
        a.profess();
    }

}
