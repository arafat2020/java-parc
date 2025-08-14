package com.practice;

import java.util.PriorityQueue;

public class LastStoneWeight {
     public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> intQueue = new PriorityQueue<>((a, b) -> b - a);
        for (int i : stones) {
            intQueue.add(i);
        }
        while (intQueue.size() > 1) {
            int a = intQueue.poll();
            int b = intQueue.poll();
            // need to check what if both stones are equal
            if (a != b) {
                intQueue.add(a - b);
            }
        }

        return intQueue.isEmpty() ? 0 : intQueue.poll();
    }
}
