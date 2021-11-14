package edu.nwmissouri.animalList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

/**
 *
 * @author Mulamalla Akhil Kumar Reddy
 * 
 */
public class SiberianTigerTest {
    
    /*thi is roar method*/
    @Test
    public  void speak() {
        assert(true);
    }

    /*this is Run method*/
    @Test
    public void move()  {
        assert(true);
    }
    @Test
    public void ParameterizedTest() throws Exception{
         System.out.println("I can Run 80 kilometers per hour (km/h)");
        int actual=4;
        int a=4;
        assertEquals(a,actual);
    }
    }
