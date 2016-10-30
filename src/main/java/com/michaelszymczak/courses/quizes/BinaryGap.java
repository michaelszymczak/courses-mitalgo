package com.michaelszymczak.courses.quizes;

class BinaryGap {
    public int solution(int N) {
        return new Data(N)
                .withAllTrailingZerosStripped()
                .withAllCalculationsDone()
                .result;
    }

    private static class Data {

        final int input, count, result;

        Data(int input) { this.input = input; this.count = 0; this.result = 0; }
        Data(int input, int count, int result) { this.input = input; this.count = count; this.result = result; }


        Data withAllTrailingZerosStripped() {
            return !isZeroNext() ? asIs() : withNextTrailingZeroStripped().withAllTrailingZerosStripped();
        }

        Data withAllCalculationsDone() {
            return nothingLeft() ? asIs() : withNextStepCalculated().withAllCalculationsDone();
        }

        Data withNextStepCalculated() {
            return isZeroNext() ? nextIncrementingCount() : sumUpAndResetCount();
        }

        Data asIs() { return this; }
        boolean isZeroNext() { return input != 0 && input % 2 == 0; }
        boolean nothingLeft() { return input == 0; }
        Data nextIncrementingCount() { return new Data(input / 2, count + 1, result); }
        Data sumUpAndResetCount() { return new Data(input / 2, 0, count > result ? count : result); }
        Data withNextTrailingZeroStripped() { return new Data(input / 2, count, result); }

    }
}