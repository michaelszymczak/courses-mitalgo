package com.michaelszymczak.courses.quizes;

public class RotationOnOn
{
    int[] solution(int[] A, int K)
    {

        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++)
        {
            B[calculateNewPosition(A.length, i, K)] = A[i];
        }

        return B;
    }

    private static int calculateNewPosition(int length, int originalPosition, int K)
    {
        return (originalPosition + K) % length;
    }
}
