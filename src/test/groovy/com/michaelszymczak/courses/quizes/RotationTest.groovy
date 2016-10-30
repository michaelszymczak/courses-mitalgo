package com.michaelszymczak.courses.quizes

import spock.lang.Specification

class RotationTest extends Specification {

    def "works in O(n) time and O(n) memory"() {
        expect:
        solutionInOnMemory(A as int[], K as int) == result as int[]

        where:
        K | A                  | result
        0 | []                 | []
        0 | [4]                | [4]
        1 | [5]                | [5]
        2 | []                 | []
        1 | [4, 5]             | [5, 4]
        2 | [5, 6]             | [5, 6]
        3 | [1, 2, 3, 4, 5, 6] | [4, 5, 6, 1, 2, 3]
        2 | [1, 2, 3, 4, 5, 6] | [5, 6, 1, 2, 3, 4]
    }

    private static int[] solutionInOnMemory(int[] A, int K) {
        new RotationOnOn().solution(A, K)
    }
}
