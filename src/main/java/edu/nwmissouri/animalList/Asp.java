
package edu.nwmissouri.animalList;
/**

* Asp class (derived subclass of the superclass Animal)
*
* @author Priyanka Maruthi
*/

public class Asp extends Animal {
 /**

     * Aardvark constructor

     * @param name - the name of this aardvark

     */

    public Asp(String name) {

        super(name);

    }

   @Override

    public void speak() {

        System.out.printf("I'm %s. I'm an Asp! ", this.name);

    }
  @Override

    public void move() {

        System.out.println("When I move, I slither, slither, slither.");

    }

 

}
