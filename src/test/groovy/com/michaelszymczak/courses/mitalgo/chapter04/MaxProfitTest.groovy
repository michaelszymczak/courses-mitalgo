package com.michaelszymczak.courses.mitalgo.chapter04

import spock.lang.Specification

class MaxProfitTest extends Specification {

    def "should have no profit if can't sell after buying"() {
        expect:
        calculatedMaxProfitOf(prices) == 0

        where:
        prices << [
                [5],
                []
        ]
    }

    def "should sell at maximum price after buying"() {
        expect:
        calculatedMaxProfitOf(prices) == expectedMaxProfit

        where:
        prices             | expectedMaxProfit
        [2, 3]             | 1
        [2, 2, 2]          | 0
        [1, 5, 3, 7, 4, 6] | 6
    }

    def "should postpone buying if lower price occurs later"() {
        given:
        int[] prices = inputPrices

        expect:
        MaxProfit.of(prices).profit() == expectedMaxProfit

        where:
        inputPrices          | expectedMaxProfit
        [4, 5, 3, 7, 9, 11]  | 8
        [5, 5, 4, 3, 10, 10] | 7
    }

    private static int calculatedMaxProfitOf(List prices) {
        MaxProfit.of(prices as int[]).profit()
    }
}
