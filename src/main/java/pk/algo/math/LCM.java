package pk.algo.math;

/**
 * Least Common Multiplier
 * LCM(A, B) = A * B / GCD(A, B)
 */
public class LCM {

    public int findLCM(int a, int b) {
        return a / MathUtils.findGCD(a, b) * b;
    }
}
