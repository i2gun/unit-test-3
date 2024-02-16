package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    MainHW test;

    @BeforeEach
    public void setTestClass() {
        test = new MainHW();
    }

    @Test
    public void testEvenNumber() {
        assertTrue(test.evenOddNumber(4));
    }

    @Test
    public void testOddNumber() {
        assertFalse(test.evenOddNumber(5));
    }

    @Test
    public void testLessThan25() {
        assertFalse(test.numberInInterval(5));
    }

    @Test
    public void testEqualTo25() {
        assertTrue(test.numberInInterval(25));
    }

    @Test
    public void testMoreThan25LessThan100() {
        assertTrue(test.numberInInterval(75));
    }

    @Test
    public void testEqualTo100() {
        assertTrue(test.numberInInterval(100));
    }

    @Test
    public void testMoreThan100() {
        assertFalse(test.numberInInterval(105));
    }

}