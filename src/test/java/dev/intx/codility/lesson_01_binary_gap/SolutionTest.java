package dev.intx.codility.lesson_01_binary_gap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private Solution instance = new Solution();

    @Test
    void shouldHandleZero() {
        assertThat(instance.solution(0)).isEqualTo(0);
    }

    @Test
    void shouldHandleAllOnes() {
        assertThat(instance.solution(0xFFFFFFFF)).isEqualTo(0);
    }

    @Test
    void shouldHandleOne() {
        assertThat(instance.solution(1)).isEqualTo(0);
    }

    @Test
    void shouldHandleTwo() {
        assertThat(instance.solution(2)).isEqualTo(0);
    }

    @Test
    void shouldHandleFour() {
        assertThat(instance.solution(4)).isEqualTo(0);
    }

    @Test
    void shouldHandleLeftmostOne() {
        assertThat(instance.solution(1 << 30)).isEqualTo(0);
    }

    @Test
    void shouldHandleGap() {
        assertThat(instance.solution((1 << 30) + 1)).isEqualTo(29);
    }

    @Test
    void shouldHandleSingleGap() {
        assertThat(instance.solution(0xFFFFFFFB)).isEqualTo(1);
    }

    @Test
    void shouldHandleLongeGap() {
        assertThat(instance.solution(0x00FFFFFB)).isEqualTo(1);
    }

    @Test
    void shouldHandleLongerGap() {
        assertThat(instance.solution(0x00F000FB)).isEqualTo(12);
    }

}