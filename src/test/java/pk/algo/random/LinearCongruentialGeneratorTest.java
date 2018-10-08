package pk.algo.random;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class LinearCongruentialGeneratorTest {


    @Test
    public void generateRandoms() {
        int a = 7, b = 7, mask = 30;
        LinearCongruentialGenerator r = new LinearCongruentialGenerator(a, b, mask);

        IntStream.generate(r::nextInt).limit(20).forEach(System.out::println);
    }

}