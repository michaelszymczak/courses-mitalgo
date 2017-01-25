package com.michaelszymczak.courses.mitalgo.chapter04;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaxProfit
{
    private static final int NO_PROFIT = 0;

    private final int[] sequence;

    public static MaxProfit of(int... sequence)
    {
        return new MaxProfit(sequence);
    }

    private MaxProfit(int... sequence) {
        this.sequence = Arrays.copyOf(sequence, sequence.length);
    }

    public Integer profit() {
        return isEnoughTimeToBuyAndSell() ? calculatedProfit() : NO_PROFIT;
    }

    private int calculatedProfit() {
        return IntStream.of(sequence).max().getAsInt() - sequence[0];
    }

    private boolean isEnoughTimeToBuyAndSell() {
        return sequence.length > 1;
    }
}
