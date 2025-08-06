package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if (anagramMap.containsKey(sortedStr)) {
                anagramMap.get(sortedStr).add(str);
            } else {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
        }

        return new ArrayList<>(anagramMap.values());
    }
}
