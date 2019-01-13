package pk.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @Test
    void findPermutations() {
        System.out.println(Permutations.findPermutations("abc", 2));
        System.out.println(Permutations.findPermutations("abc", 3));
    }
}