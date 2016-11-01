package com.michaelszymczak.courses.quizes;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Shooting {

    private final int STEP = 2;

    public Integer calculateUsingList(List<Integer> input) {
        return calc(new ArrayList<>(input));
    }

    public Integer calculateUsingDequeue(List<Integer> input) {
        return calc(new ArrayDeque<>(input));
    }

    private Integer calc(List<Integer> group) {
        Integer oneWithGun = group.get(0);
        if (group.size() <= STEP)  { return oneWithGun; }
        group = group.subList(STEP, group.size()); // check if operation with O(1) time complexity
        group.add(oneWithGun);

        return calc(group);
    }

    private Integer calc(Deque<Integer> group) {
        if (group.size() <= STEP)  { return group.peek(); }

        Integer oneWithGun = group.removeFirst();
        group.removeFirst();
        group.addLast(oneWithGun);

        return calc(group);
    }
}
