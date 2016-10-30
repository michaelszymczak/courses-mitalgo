package com.michaelszymczak.courses.quizes

import spock.lang.Specification

class OddOccurrencesTest extends Specification {
    def "tests"() {
        expect:
        new OddOccurrences().solution(A as int[]) == result

        where:
        result | A
        0      | []
        5      | [5]
        7      | [7]
        0      | [7, 7]
        5      | [7, 5, 7]
        9      | [7, 8, 7, 9, 8]

    }
}
