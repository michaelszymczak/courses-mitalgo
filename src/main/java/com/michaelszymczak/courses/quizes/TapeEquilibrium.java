package com.michaelszymczak.courses.quizes;

import java.util.Arrays;

public class TapeEquilibrium {
    public int solution(int[] A) {

        int result = Integer.MAX_VALUE;
        int r = sumOfAllIn(A);
        int l = 0;

        for (int pos = 0; pos < A.length - 1; pos++) {
            l += A[pos];
            r -= A[pos];
            result = result > Math.abs(l - r) ? Math.abs(l - r) : result;
        }

        return result;
    }

    private static int sumOfAllIn(int[] A) {
        return Arrays.stream(A).sum();
    }
}
