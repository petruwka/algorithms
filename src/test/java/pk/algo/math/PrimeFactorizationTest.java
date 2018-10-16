package pk.algo.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorizationTest {

    @Test
    void getPrimes() {
        PrimeFactorization primeFactorization = new PrimeFactorization();
        assertEquals(Arrays.asList(2, 2, 2, 2), primeFactorization.getPrimes(16));
        assertEquals(Arrays.asList(2, 3, 5), primeFactorization.getPrimes(30));
        assertEquals(Arrays.asList(2, 3, 7), primeFactorization.getPrimes(42));
        assertEquals(Arrays.asList(47), primeFactorization.getPrimes(47));
    }
}