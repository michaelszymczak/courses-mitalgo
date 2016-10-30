package com.michaelszymczak.courses.quizes

import spock.lang.Specification

class TapeEquilibriumTest extends Specification {

    def "should calculate equilibrium"() {
        expect:
        new TapeEquilibrium().solution(A as int[]) == result

        where:
        result | A
        1      | [3, 1, 2, 4, 3]
        0      | [3, 1, 2, 3, 1, 2]
        1      | [3, 4, 3, 2, 1]
        97     | [3, 100]
    }
}
