package pk.algo.random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayShufflerTest {

    @Test
    void shuffle() {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayShuffler shuffler = new ArrayShuffler();
        shuffler.shuffle(arr);

        System.out.println(Arrays.toString(arr));
    }
}