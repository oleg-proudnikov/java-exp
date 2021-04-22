package dev.intx.codility.lesson_3_perm_missing_element;

/**
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)],
 * which means that exactly one element is missing.
 * <p>
 * Your goal is to find that missing element.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A, returns the value of the missing element.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * the function should return 4, as it is the missing element.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 */
public class Solution {
    public int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        }
        int N = A.length;
        int pairs = (N + 1) / 2;
        long sum = (long) (N + 2) * pairs;
        if (N % 2 == 0) {
            sum += 1 + N / 2;
        }
        for (int v : A) {
            sum -= v;
        }
        return (int) sum;
    }
}
