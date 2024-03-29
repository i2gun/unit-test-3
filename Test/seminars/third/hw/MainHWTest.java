package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    MainHW test;

    @BeforeEach
    void setTestClass() {
        test = new MainHW();
    }

    @Test
    void testEvenNumber() {
        assertTrue(test.evenOddNumber(4));
    }

    @Test
    void testOddNumber() {
        assertFalse(test.evenOddNumber(5));
    }

    @Test
    void testLessThan25() {
        assertFalse(test.numberInInterval(5));
    }

    @Test
    void testEqualTo25() {
        assertTrue(test.numberInInterval(25));
    }

    @Test
    void testMoreThan25LessThan100() {
        assertTrue(test.numberInInterval(75));
    }

    @Test
    void testEqualTo100() {
        assertTrue(test.numberInInterval(100));
    }

    @Test
    void testMoreThan100() {
        assertFalse(test.numberInInterval(105));
    }

}