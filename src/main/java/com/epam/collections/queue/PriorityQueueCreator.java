package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> modifiedList = new ArrayList<>(firstList);
        modifiedList.addAll(secondList);
        PriorityQueue<String> result = new PriorityQueue<>(Collections.reverseOrder());
        result.addAll(modifiedList);

        return result;
    }
}
