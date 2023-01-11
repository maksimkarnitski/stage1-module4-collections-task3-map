package com.epam.mjc.collections.map;

import java.lang.reflect.Array;
import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        sentence = sentence.toLowerCase();
        List<String> words = List.of(sentence.split("\\W+"));
        if (words.size() > 1) {
            for (String word : words) {
                int count = 0;
                for (String word2 : words) {
                    if (word.contains(word2)) {
                        count++;
                    }
                }
                result.put(word.toLowerCase(), count);
            }
        }
        return result;
    }
}

