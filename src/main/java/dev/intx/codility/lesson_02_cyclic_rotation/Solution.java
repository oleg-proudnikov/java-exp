package dev.intx.codility.lesson_02_cyclic_rotation;


class Solution {
    public int[] solution(int[] A, int K) {
        if (A.length > 0 && K % A.length > 0) {
            int k = K % A.length;
            int[] tmp = new int[k];
            System.arraycopy(A, A.length - k, tmp, 0, k);
            System.arraycopy(A, 0, A, k, A.length - k);
            System.arraycopy(tmp, 0, A, 0, k);
        }
        return A;
    }
}
