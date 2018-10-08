package pk.algo.random;

import java.util.Random;

public class ArrayShuffler {

    private Random random = new Random();

    public void shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = randomInt(array.length - i) + i;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    private int randomInt(int bound) {
        return random.nextInt(bound);
    }


}
