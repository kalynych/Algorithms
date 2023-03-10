import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        int startNumber = 1;
        int endNumber = 30;
        String[] expectedResult =
                {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz",
                        "16", "17", "Fizz", "19", "Buzz", "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29",
                        "FizzBuzz"};

        FizzBuzz fizzBuzzObj = new FizzBuzz();
        String[] actualResult = fizzBuzzObj.fizzBuzz(startNumber, endNumber);
        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
