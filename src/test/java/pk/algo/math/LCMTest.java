package pk.algo.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCMTest {

    @Test
    void findLCM() {
        LCM lcm = new LCM();
        assertEquals(15, lcm.findLCM(3, 5));
        assertEquals(60, lcm.findLCM(12, 15));
        assertEquals(21, lcm.findLCM(7, 21));

    }
}