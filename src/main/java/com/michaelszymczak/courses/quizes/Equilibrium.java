package com.michaelszymczak.courses.quizes;

import java.util.Arrays;

public class Equilibrium {

    private int[] A;
    private long leftSum;
    private long rightSum;
    private int position;

    public static int solution(int[] A) {
        return new Equilibrium(A).getEquilibriumPosition();
    }

    private Equilibrium(int[] input) {
        leftSum = 0;
        rightSum = sumOfAllElementsOf(input);
        position = 0;
        this.A = input;
    }

    private int getEquilibriumPosition() {
        while (canStepRight()) {
            if (isEquilibrium()) {
                return getCurrentPosition();
            }
            stepRight();
        }

        return getSpecialNotFoundPosition();
    }

    private boolean isEquilibrium() {
        return getLeftSum() == getRightSum();
    }

    private int getCurrentPosition() {
        return position;
    }

    private long getRightSum() {
        return rightSum - valueAtCurrentPosition();
    }

    private long getLeftSum() {
        return leftSum;
    }

    private void stepRight() {
        addCurrentPositionValueToLeft();
        subtractValueOfCurrentPositionFromRight();
        increasePosition();
    }

    private void subtractValueOfCurrentPositionFromRight() {
        rightSum -= valueAtCurrentPosition();
    }

    private void addCurrentPositionValueToLeft() {
        leftSum += valueAtCurrentPosition();
    }

    private void increasePosition() {
        position++;
    }

    private int valueAtCurrentPosition() {
        return A[getCurrentPosition()];
    }

    private boolean canStepRight() {
        return getCurrentPosition() < A.length;
    }

    private int getSpecialNotFoundPosition() {
        return -1;
    }

    private static long sumOfAllElementsOf(int[] A) {
        return Arrays.stream(A).asLongStream().sum();
    }
}
