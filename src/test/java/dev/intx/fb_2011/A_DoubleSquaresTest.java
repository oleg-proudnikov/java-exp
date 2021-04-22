package dev.intx.fb_2011;

import org.junit.jupiter.api.Test;

import static dev.intx.fb_2011.A_DoubleSquares.DoubleSquares.count;
import static org.assertj.core.api.Assertions.assertThat;

public class A_DoubleSquaresTest {


    int[] sums = {0, 1, 2, 4, 5, 8, 9, 10, 13, 16, 17, 18, 20, 25, 26, 29, 32, 34, 36, 37, 40, 41,
                  45, 49, 50, 52, 53, 58, 61, 64, 65, 68, 72, 73, 74, 80, 81, 82, 85, 89, 90, 97, 98,
                  100, 101, 104, 106, 109, 113, 116, 117, 121, 122, 125, 128, 130, 136, 137, 144,
                  145, 146, 148, 149, 153, 157, 160, 162, 164, 169, 170, 173, 178, 180, 181, 185,
                  193, 194, 196, 197, 200};

    int[] notSums = {3, 6, 7, 11, 12, 14, 15, 19, 21, 22, 23, 24, 27, 28, 30, 31, 33, 35, 38, 39, 42, 43, 44, 46,
                     47, 48, 51, 54, 55, 56, 57, 59, 60, 62, 63, 66, 67, 69, 70, 71, 75, 76, 77, 78, 79,
                     83, 84, 86, 87, 88, 91, 92, 93, 94, 95, 96, 99, 102, 103, 105, 107, 108, 110, 111,
                     112, 114, 115, 118, 119, 120, 123, 124, 126, 127, 129, 131, 132, 133, 134, 135,
                     138, 139, 140, 141, 142, 143, 147, 150, 151, 152, 154, 155, 156, 158, 159, 161,
                     163, 165, 166, 167, 168, 171, 172, 174, 175, 176, 177, 179, 182, 183, 184, 186,
                     187, 188, 189, 190, 191, 192, 195, 198, 199};

    @Test
    public void shouldFindSums() {

        for (var n : sums) {
            assertThat(count(n)).isGreaterThan(0);
        }

        for (int i = 0; i < sums.length - 1; ++i) {
            assertThat(count(sums[i] + sums[i + 1])).isGreaterThan(0);
        }
    }

    @Test
    public void productShouldBeASum() {

        for (int i = 0; i < sums.length - 1; ++i) {
            assertThat(count(sums[i] * sums[i + 1])).isGreaterThan(0);
        }
    }

    @Test
    public void doubleSumIsSum() {

        for (var n : sums) {
            assertThat(count(2 * n)).isGreaterThan(0);
        }
    }

    @Test
    public void shouldNotFindSums() {

        for (var n : notSums) {
            assertThat(count(n)).isZero();
        }
    }
}
