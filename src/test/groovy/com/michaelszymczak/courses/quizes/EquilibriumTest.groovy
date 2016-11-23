package com.michaelszymczak.courses.quizes

import spock.lang.Specification

class EquilibriumTest extends Specification
{
    def "should be position of the only element"() {
        expect: solution(4) == 0
    }

    def "should be position of the first element if right side sum is zero"() {
        expect:
        solution(-1,0) == 0
        solution(5,0,0) == 0
        solution(5,-1,1) == 0
        solution(500, 1, -2, -1, 2) == 0
    }

    def "should be -1 if not equilibrium found"() {
        expect:
        solution() == -1
        solution(-1,1) == -1
        solution(5,0,1) == -1
    }

    def "should be position in which sum on the left equals sum on the right"() {
        expect:
        solution(-1,  3, -4,  5,  1, -6,  2,  1) == 1
        solution(0, 3) == 1
        solution( 1,  1, -1,  -1, -1) == 4
        solution( -1,  0, -1,  -1) == 2
        solution( -1,  -1, -1, -1, -1) == 2
    }

    def "should handle large numbers"() {
        expect:
        solution( -2147483648,  -2147483648, -2147483648,  -2147483648) == -1
        solution( -2147483648, -2147483648, -2147483648, -2147483648,  -2147483648) == 2
        solution( 2147483647, 2147483647, 2147483647, 2147483647,  2147483647) == 2
        solution( 2147483647,  2147483647, -2147483647,  -2147483647, -2147483647) == 4
        solution( -2147483648, -2147483648, -2147483648, -2147483648,  -2147483648) == 2
        solution( (0..100_000).collect { Integer.MIN_VALUE } as int[]) == 50_000
        solution( (0..100_000).collect { Integer.MAX_VALUE } as int[]) == 50_000
    }

    private static int solution(int... input)
    {
        Equilibrium.solution(input)
    }
}
