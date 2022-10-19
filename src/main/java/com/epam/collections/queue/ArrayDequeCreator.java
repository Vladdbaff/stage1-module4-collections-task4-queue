package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        result.addLast(firstQueue.remove());
        result.addLast(firstQueue.remove());

        result.addLast(secondQueue.remove());
        result.addLast(secondQueue.remove());


        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.add(result.removeLast());
            result.addLast(firstQueue.remove());
            result.addLast(firstQueue.remove());

            secondQueue.add(result.removeLast());
            result.addLast(secondQueue.remove());
            result.addLast(secondQueue.remove());
        }

        return result;
    }
}
