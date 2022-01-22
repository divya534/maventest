package example.maventest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FizzBuzzTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void fizzBuzzFail()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String response = fizzBuzz.displayFizz("2");
        assertEquals("2", response);
    }
    
    @Test
    public void fizzBuzzMultipleOfThree()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String response = fizzBuzz.displayFizz("Hello");
        assertEquals("Hello", response);
    }
    
    @Test
    public void fizzBuzzMultipleofFive()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String response = fizzBuzz.displayFizz("10");
        assertEquals("buzz", response);
    }
    
    @Test
    public void fizzBuzzRandom()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String response = fizzBuzz.displayFizz("8");
        assertEquals("8", response);
    }
    
    @Test
    public void fizzBuzzMultipleofFiveAndThree()
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String response = fizzBuzz.displayFizz("30");
        assertEquals("fizzbuzz", response);
    }
    
}
