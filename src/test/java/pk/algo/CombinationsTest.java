package pk.algo;

import org.junit.jupiter.api.Test;

class CombinationsTest {


    @Test
    void findSelections() {
        System.out.println(Combinations.findSelections("abc", 2));
        System.out.println(Combinations.findSelections("abc", 3));
    }
}