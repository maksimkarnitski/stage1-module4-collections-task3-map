package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        Map<Integer, String> sourceMapCopy = new HashMap<>(sourceMap);
        Map<Integer, String> sourceMapCopyAsResult = new HashMap<>(sourceMap);

        for (Map.Entry<Integer, String> s : sourceMap.entrySet()) {
            for (Map.Entry<Integer, String> sc : sourceMapCopy.entrySet()) {
                if (s.getValue().contains(sc.getValue()) && sc.getKey() > s.getKey()) {
                    sourceMapCopyAsResult.remove(sc.getKey());
                }
            }
        }
        for (Map.Entry<Integer, String> s : sourceMapCopyAsResult.entrySet()) {
            result.put(s.getValue(), s.getKey());
        }
        return result;
    }
}
