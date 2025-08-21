package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> combinations = new ArrayList<>();
        findMatches(candidates, target, 0, 0, new ArrayList<>(), combinations);
        return combinations;
    }

    public void findMatches(int[] candidates, int target, int index, int total, List<Integer> currentCombination,
            List<List<Integer>> combinations) {
        // I added currentCombination directly. But currentCombination is a reference
        // that keeps changing in recursion. I need to add a copy
        if (target == 0) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }

        if (target < 0 || index >= candidates.length) {
            return;
        }

        currentCombination.add(candidates[index]);
        findMatches(candidates, target - candidates[index], index, total + candidates[index], currentCombination,
                combinations);
        currentCombination.remove(currentCombination.size() - 1);
        findMatches(candidates, target, index + 1, total + candidates[index], currentCombination, combinations);
    }

    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> result = cs.combinationSum(candidates, target);
        System.out.println(result);
    }
}
