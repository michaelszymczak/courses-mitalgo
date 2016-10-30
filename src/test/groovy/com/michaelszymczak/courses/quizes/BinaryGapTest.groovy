package com.michaelszymczak.courses.quizes

import spock.lang.Specification
import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class BinaryGapTest extends Specification {

    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    def "should count the longest sequence of zeros surrounded by ones"() {
        expect:
        gap(input) == expectdOutput

        where:
        input                    | expectdOutput
        "0"                      | 0
        "1"                      | 0
        "10"                     | 0
        "01"                     | 0
        "101"                    | 1
        "1001"                   | 2
        "110101010111100"        | 1
        "1101010001011110000000" | 3
        "1" + "0" * 29 + "1"     | 29

    }

    private static int gap(String binaryRepresentation) {
        new BinaryGap().solution(Integer.parseInt(binaryRepresentation, 2))
    }
}
