package com.ericsson.answers;

import com.ericsson.Intersections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionAnswers extends Intersections {

    @Override public Set<String> intersection(List<String> firstWords, List<String> secondWords) {
        HashSet<String> firstWordsSet = new HashSet<>(firstWords);
        HashSet<String> answer = new HashSet<>();

        for (String word: secondWords) {
            if (firstWordsSet.contains(word)) {
                answer.add(word);
            }
        }
        return answer;
    }

    //TODO: implement the other one :)
}
