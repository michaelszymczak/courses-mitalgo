package com.michaelszymczak.courses.quizes

import spock.lang.Specification

class ShootingTest extends Specification {

    def "should work"() {
        expect:
        new Shooting().calculate(input) == result

        where:
        result | input
        0      | [0]
        0      | [0, 1]
        2      | [0, 1, 2]
        0      | [0, 1, 2, 3]
        0      | [0, 1, 2, 3]
        4      | [0, 1, 2, 3, 4, 5]
    }
}
