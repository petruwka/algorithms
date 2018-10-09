package pk.algo.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    private GCD gcd = new GCD();

    @Test
    void findGCD() {
        assertEquals(5, gcd.findGCD(10, 5));
        assertEquals(5, gcd.findGCD(5, 10));
        assertEquals(1, gcd.findGCD(13, 4));
        assertEquals(2, gcd.findGCD(-14, 4));
        assertEquals(2, gcd.findGCD(16374, 8395058));
    }
}