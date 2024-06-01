package dam.proves;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyCalculatorTest {

    private MyCalculator myCalculator;

    @BeforeEach
    public void setUpMyCalculator() {
        myCalculator = new MyCalculator();
        System.out.println("MyCalculator created");
    }

    @AfterEach
    public void tearDownMyCalculator() {
        myCalculator = null;
        System.out.println("MyCalculator=null");
    }

    @Test
    public void testSub() {
        assertEquals(0, myCalculator.sub(5, 5));
    }

    @Test
    public void testMult() {
        assertEquals(25, myCalculator.mult(5, 5));
    }

    @Test
    public void divByZero() {
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> myCalculator.div(5, 0));
        assertEquals("Divisió per zero", thrown.getMessage());
    }

    @Test
    public void addWhenNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> myCalculator.add(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> myCalculator.add(5, -1));
    }

    @Test
    public void subWhenNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> myCalculator.sub(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> myCalculator.sub(5, -1));
    }

    @Test
    public void multWhenNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> myCalculator.mult(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> myCalculator.mult(5, -1));
    }

    @Test
    public void divWhenNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> myCalculator.div(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> myCalculator.div(5, -1));
    }
}