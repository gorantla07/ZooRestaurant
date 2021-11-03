package edu.nwmissouri.zoo04lab;

/**
 * Animal number of leg options
 * 
 * Illustrates enumerated types (Java enum with int value)
 * Good for attributes selected from a drop-down list
 *
 * @author Denise Case
 */
public enum AnimalLegs {

    /**
     * Animal has no legs / does not apply
     */
    NO_LEGS(1),
    /**
     * Animal generally has two legs
     */
    TWO_LEGS(2),
    /**
     * Animal generally has four legs
     */
    FOUR_LEGS(3),
    /**
     * Animal generally has many legs (more than 4)
     */
    OVER_FOUR_LEGS(4);
    
    // Add private constructor if we want numeric values (e.g., in a database)

    private final int count;

    private AnimalLegs(int countInput) {
        this.count = countInput;
    }

    public int getStatus() {
        return this.count;
    }
}
