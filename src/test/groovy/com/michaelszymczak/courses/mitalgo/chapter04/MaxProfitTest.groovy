package com.michaelszymczak.courses.mitalgo.chapter04

import spock.lang.Specification

class MaxProfitTest extends Specification {

    def "should have no profit if can't sell after buying"() {
        expect:
        MaxProfit.of(5).profit() == 0
        MaxProfit.of().profit() == 0
    }

    def "should sell at maximum price after buying"() {
        given:
        int[] prices = inputPrices

        expect:
        MaxProfit.of(prices).profit() == expectedMaxProfit

        where:
        inputPrices        | expectedMaxProfit
        [2, 3]             | 1
        [2, 2, 2]          | 0
        [1, 5, 3, 7, 4, 6] | 6
    }
}
