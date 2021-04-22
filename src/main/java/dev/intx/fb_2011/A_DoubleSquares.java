package dev.intx.fb_2011;

public class A_DoubleSquares {

    static class DoubleSquares {

        public static int countDoubleSquares(int x) {
            if (x == 0) {
                return 1;
            }

            int cnt = 0;
            double u = x;
            for (int l = 0; l < u; ++l) {
                u = Math.sqrt(x - l * l);
                if (u == (int) u) {
                    ++cnt;
                }
            }
            return cnt;
        }
    }

}
