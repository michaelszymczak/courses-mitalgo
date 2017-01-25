package com.michaelszymczak.courses.mitalgo.chapter04;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaxProfit
{
    private final int[] sequence;

    public static MaxProfit of(int... sequence)
    {
        return new MaxProfit(sequence);
    }

    private MaxProfit(int... sequence) {
        this.sequence = Arrays.copyOf(sequence, sequence.length);
    }

    public Integer profit() {
        return IntStream.of(sequence).max().orElse(0) - IntStream.of(sequence).min().orElse(0);
    }

}
