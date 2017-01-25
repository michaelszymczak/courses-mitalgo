package com.michaelszymczak.courses.mitalgo.chapter04

import spock.lang.Specification

class MaxProfitTest extends Specification {

    def "should have no profit if can't sell after buying"() {
        expect:
        MaxProfit.of(5).profit() == 0
        MaxProfit.of().profit() == 0
    }
}
