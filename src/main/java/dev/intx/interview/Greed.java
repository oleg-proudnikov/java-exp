package dev.intx.interview;

import java.util.Arrays;

public class Greed {

    public int valueOf(int[] dice) {
        int c1 = count(dice, 1);
        int c2 = count(dice, 2);
        int c3 = count(dice, 3);
        int c4 = count(dice, 4);
        int c5 = count(dice, 5);
        int c6 = count(dice, 6);

        return
                // Singles: 1 and 5
                c1 % 3 * 100 +
                c5 % 3 * 50 +

                // Triples
                c1 / 3 * 1000 +
                c2 / 3 * 200 +
                c3 / 3 * 300 +
                c4 / 3 * 400 +
                c5 / 3 * 500 +
                c6 / 3 * 600;
    }

    public int count(int[] dice, int value) {
        return (int) Arrays.stream(dice).filter(v -> v == value).count();
    }
}
