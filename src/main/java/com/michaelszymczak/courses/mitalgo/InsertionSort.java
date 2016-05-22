package com.michaelszymczak.courses.mitalgo;

public class InsertionSort {

    private static final int FIRST_INDEX =  0;

    public static int[] sorted(int... input) {
        int[] A = input.clone();
        final int LAST_INDEX = A.length - 1;

        for (int j = 1; j <= LAST_INDEX; j++) {
            int key = A[j];
            int i = j - 1;

            while (i >= FIRST_INDEX && A[i] > key) {
                A[i + 1] = A[i];
                --i;
            }
            A[i + 1] = key;
        }

        return A;
    }
}
