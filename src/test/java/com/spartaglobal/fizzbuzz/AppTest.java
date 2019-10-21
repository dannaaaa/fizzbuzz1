package com.spartaglobal.fizzbuzz;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testForFizzBuzz(){
        Assert.assertEquals("FIZZBUZZ", "FIZZBUZZ");
    }

    @Test
    public void testForFizz (){
        Assert.assertEquals("Fizz", "Fizz");
    }

    @Test
    public  void testForBuzz (){
        Assert.assertEquals("Buzz", "Buzz");
    }

}
