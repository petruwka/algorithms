package pk.algo.math;

public class MathUtils {

    private static GCD GCD_INSTANCE = new GCD();

    public static int findGCD(int a, int b) {
        return GCD_INSTANCE.findGCD(a, b);
    }
}
