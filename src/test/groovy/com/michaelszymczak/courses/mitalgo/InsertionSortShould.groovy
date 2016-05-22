package com.michaelszymczak.courses.mitalgo

import spock.lang.Specification

import static com.michaelszymczak.courses.mitalgo.InsertionSort.sorted

class InsertionSortShould extends Specification {

    def "return empty array if empty array as input"() {
        expect:
        sorted() == array()
    }

    def "consider one element array as sorted"() {
        expect:
        sorted(4) == array(4)
        sorted(-2) == array(-2)
    }

    def "swap the elements if the one on the right is smaller that the one on the left"() {
        expect:
        sorted(3, 2) == array(2, 3)
    }

    def "keep the order of keys if the array is already sorted"() {
        expect:
        sorted(2, 3) == array(2, 3)
    }

    def "the largest element be the las one"() {
        expect:
        sorted(4,1,2,3) == array(1,2,3,4)
        sorted(4,2,2,2) == array(2,2,2,4)
    }

    def "left hand side element be no larger than right side elements after being sorted"() {
        expect:
        sorted(4,2,2,1) == array(1,2,2,4)
        sorted(1,2,2,3) == array(1,2,2,3)
        sorted(1,-10,14,2,1) == array(-10,1,1,2,14)
    }

    def "not change the original array"() {
        given:
        int[] input = array(3, 2)

        expect:
        sorted(input) != input
    }

    private static int[] array(int... i) {
        return i as int[]
    }
}
