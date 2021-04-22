package dev.intx.interview;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class GreedTest {

    static class Should {

        @ParameterizedTest
        @MethodSource("throwFiveDice")
        public void calculateFiveDice(int[] dice, int expectedValue) {
            Assertions.assertThat(new Greed().valueOf(dice)).isEqualTo(expectedValue);
        }

        private static Stream<Arguments> throwFiveDice() {
            return Stream.of(
                    // Ones
                    Arguments.of(dice(1, 2, 3, 4, 6), 100),
                    Arguments.of(dice(1, 1, 2, 3, 4), 200),
                    Arguments.of(dice(1, 1, 1, 2, 2), 1000),
                    Arguments.of(dice(1, 1, 1, 1, 2), 1100),
                    Arguments.of(dice(1, 1, 1, 1, 1), 1200),

                    // Fives
                    Arguments.of(dice(5, 2, 3, 4, 6), 50),
                    Arguments.of(dice(5, 5, 3, 4, 6), 100),
                    Arguments.of(dice(5, 5, 5, 3, 4), 500),
                    Arguments.of(dice(5, 5, 5, 5, 2), 550),
                    Arguments.of(dice(5, 5, 5, 5, 5), 600),

                    // Ones & Fivers
                    Arguments.of(dice(1, 5, 2, 3, 4), 150),
                    Arguments.of(dice(1, 5, 5, 5, 4), 600),
                    Arguments.of(dice(1, 1, 5, 5, 5), 700),
                    Arguments.of(dice(1, 1, 1, 5, 5), 1100),
                    Arguments.of(dice(1, 1, 1, 1, 5), 1150),

                    Arguments.of(dice(2, 2, 3, 4, 6), 0),
                    Arguments.of(dice(2, 2, 3, 3, 4), 0),
                    Arguments.of(dice(2, 2, 4, 4, 6), 0),

                    // Triples of 2, 3, 4, 6
                    Arguments.of(dice(2, 2, 2, 2, 2), 200),
                    Arguments.of(dice(4, 4, 4, 5, 5), 500),
                    Arguments.of(dice(6, 6, 6, 6, 6), 600),

                    // Triples of 2, 3, 4, 6 & 1, 5
                    Arguments.of(dice(2, 2, 2, 1, 5), 350),
                    Arguments.of(dice(3, 3, 3, 1, 5), 450),
                    Arguments.of(dice(4, 4, 4, 1, 5), 550),
                    Arguments.of(dice(6, 6, 6, 1, 5), 750)
                            );
        }

        private static int[] dice(int... dice) {
            return dice;
        }
    }

}
