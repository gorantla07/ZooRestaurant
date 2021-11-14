package edu.nwmissouri.animalList;

/**
 * Aardvark class (derived subclass of the superclass Animal)
 *
 * @author Dr. Case
 */
public class Aardvark extends Animal implements Runnable {
    
    
    private boolean isAlive = true;
    private int age = 1;
    private double weight_pounds = 8.0;

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight_pounds() {
        return weight_pounds;
    }

    public void setWeight_pounds(double weight_pounds) {
        this.weight_pounds = weight_pounds;
    }

    @Override
    public String toString() {
        return "Aardvark{" + "isAlive=" + isAlive + ", age=" + age + ", weight_pounds=" + weight_pounds + '}';
    }
    
    
    

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



    /**
     * An instance of an Aardvark is now Runnable - 
     * call this run() method to see all the Aardvark tricks.
     */
    @Override
    public void run() {
        this.speak();
        this.move();
        this.profess();
    }

}
