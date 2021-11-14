package edu.nwmissouri.animalList;

/**
 * Animal super class for traits shared by all animals. Abstract - don't make a
 * general animal - only specific types.
 *
 * @author Dr. Case
 */
public abstract class Animal {

    /**
     * Every animal has a name. Class variable name is not private, but
     * protected - only subclasses can use it.
     */
    protected String name = "no name";
    

    /**
     * Animals have an associated gender which may be unknown.
     *
     * We limit the choices for selection by using an enum
     */
    protected AnimalGender gender;

    /**
     * Animal constructor
     *
     * @param name - the name of this instance of an animal
     */
    public Animal(String name) {
        this.name = name;
        this.gender = AnimalGender.UNKNOWN;

    }

    /**
     * abstract speak() - has no implementation
     */
    public abstract void speak();

    /**
     * abstract move() - has no implementation
     */
    public abstract void move();

    /**
     * Get animal's name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the animal gender.
     *
     * @see edu.nwmissouri.animalList.AnimalGender
     * @return the gender
     */
    public AnimalGender getGender() {
        return gender;
    }

    /**
     * Set the animal gender using an enum
     *
     * @see edu.nwmissouri.animalList.AnimalGender
     * @param gender the gender to set
     */
    public void setGender(AnimalGender gender) {
        this.gender = gender;
    }

}
