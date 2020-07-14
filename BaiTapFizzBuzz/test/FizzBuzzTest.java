import baitapfizzbuzz.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    @DisplayName("Case -1")
    public void translateFizzBuzzTest(){
        int number=-1;
        String expected="-1";
        assertEquals(expected,FizzBuzz.translateFizzBuzz(number));
    }
    @Test
    @DisplayName("Case 0")
    public void translateFizzBuzzTest1(){
        int number=0;
        String expected="FizzBuzz";
        assertEquals(expected,FizzBuzz.translateFizzBuzz(number));
    }
    @Test
    @DisplayName("Case 3")
    public void translateFizzBuzzTest2(){
        int number=3;
        String expected="Fizz";
        assertEquals(expected,FizzBuzz.translateFizzBuzz(number));
    }
    @Test
    @DisplayName("Case 25")
    public void translateFizzBuzzTest3(){
        int number=25;
        String expected="Buzz";
        assertEquals(expected,FizzBuzz.translateFizzBuzz(number));
    }
    @Test
    @DisplayName("Case 45")
    public void translateFizzBuzzTest4(){
        int number=45;
        String expected="FizzBuzz";
        assertEquals(expected,FizzBuzz.translateFizzBuzz(number));
    }
    @Test
    @DisplayName("Case -15")
    public void translateFizzBuzzTest5(){
        int number=-15;
        String expected="-15";
        assertEquals(expected,FizzBuzz.translateFizzBuzz(number));
    }
    @Test
    @DisplayName("Case 53")
    public void translateFizzBuzzTest7(){
        int number=53;
        String expected="FizzBuzz";
        assertEquals(expected,FizzBuzz.translateFizzBuzz(number));
    }
    @Test
    @DisplayName("Case 35")
    public void translateFizzBuzzTest8(){
        int number=35;
        String expected="FizzBuzz";
        assertEquals(expected,FizzBuzz.translateFizzBuzz(number));
    }
}
