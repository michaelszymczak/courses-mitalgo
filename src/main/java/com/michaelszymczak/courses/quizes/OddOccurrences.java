package com.michaelszymczak.courses.quizes;

class OddOccurrences {public int solution(int[] A) {return java.util.Arrays.stream(A).reduce(0, (a, b) -> a ^ b);}}