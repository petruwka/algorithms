package pk.algo.math;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

    public List<Integer> getPrimes(final int number) {
        List<Integer> primes = new ArrayList<>();
        int n = number;
        while (n % 2 == 0) {
            primes.add(2);
            n = n / 2;
        }

        int factor = 3;
        double stopAt = Math.sqrt(n);

        while (factor < stopAt) {

            while (n % factor == 0) {
                primes.add(factor);
                n = n / factor;
            }

            factor = factor + 2;
            stopAt = Math.sqrt(n);
        }

        if (n > 1) {
            primes.add(n);
        }
        return primes;
    }

}
