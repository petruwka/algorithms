package pk.algo.math;

import java.util.Objects;

/**
 * Euclid's algorithm to find the GCD of 2 numbers (greatest common divider)
 * GCD(A, B) = GCD(B, A mod B)
 * Complexity: O(n) = log n
 */
public class GCD {

    public int findGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        return a > b ? doFindGDG(a, b) : doFindGDG(b, a);
    }

    private int doFindGDG(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
