package dev.intx.codility.lesson_3_perm_missing_element;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void shouldHandle5() {
        assertThat(new Solution().solution(new int[] {2, 3, 1, 5})).isEqualTo(4);
    }

    @Test
    void shouldHandle4() {
        assertThat(new Solution().solution(new int[] {2, 3, 1})).isEqualTo(4);
    }

    @Test
    void shouldHandle3() {
        assertThat(new Solution().solution(new int[] {2, 4, 1})).isEqualTo(3);
    }

    @Test
    void shouldHandle1() {
        assertThat(new Solution().solution(new int[] {1})).isEqualTo(2);
    }

    @Test
    void shouldHandle2() {
        assertThat(new Solution().solution(new int[] {2})).isEqualTo(1);
    }

}