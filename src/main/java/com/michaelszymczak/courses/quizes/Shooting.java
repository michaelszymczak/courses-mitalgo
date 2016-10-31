package com.michaelszymczak.courses.quizes;

import java.util.List;

public class Shooting {

    private final int STEP = 2;

    public Integer calculate(List<Integer> group) {

        Integer oneWithGun = group.get(0);
        if (group.size() <= STEP)  { return oneWithGun; }
        group = group.subList(STEP, group.size()); // check if operation with O(1) time complexity
        group.add(oneWithGun);

        return calculate(group);
    }
}
