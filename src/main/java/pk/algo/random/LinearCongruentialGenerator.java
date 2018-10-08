package pk.algo.random;


/**
 * X[n+1] = X[n] * A + B (mod M)
 * <ul>Rules how to select coefficients:
 * <li>B and M are prime numbers relative to each other,</li>
 * <li>A-1 is divisible by all prime factors of M,</li>
 * <li>A-1 has to be divisible by 4 if M is divisible by 4</li>
 * </ul>
 */
public class LinearCongruentialGenerator {

    private int a;
    private int b;
    private int mask;
    private int seed;

    public LinearCongruentialGenerator(int a, int b, int mask) {
        this.a = a;
        this.b = b;
        this.mask = mask;
    }

    public int nextInt() {
        int next = (seed * a + b) % mask;
        this.seed = next;
        return next;
    }
}
