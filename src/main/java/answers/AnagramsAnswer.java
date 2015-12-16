package answers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramsAnswer {

    public boolean isAnagram(String firstWord, String secondWord) {
        //Fast implementation using HashMap on characters: scales well
        //Could also sort an compare, probably better on smaller words.
        HashMap<Character, Integer> charactersNoOccurrences = new HashMap<Character, Integer>();

        //Put that stuff in the hash map.
        for (char character: firstWord.toCharArray()) {
            int currentNoOccurrences = charactersNoOccurrences.containsKey(character) ?
                    charactersNoOccurrences.get(character) : 0;

            charactersNoOccurrences.put(character, currentNoOccurrences + 1);
        }

        //Go through the hash map now to and retrieve occurrences, we want to finish with an empty map.
        for (char character: secondWord.toCharArray()) {
            if (!charactersNoOccurrences.containsKey(character)) {
                return false;
            }

            int remainingNoOccurrences = charactersNoOccurrences.get(character) - 1;

            if (remainingNoOccurrences < 1) {
                charactersNoOccurrences.remove(character);
            } else {
                charactersNoOccurrences.put(character, remainingNoOccurrences);
            }
        }

        return charactersNoOccurrences.isEmpty();
    }

    public List<List<String>> anagrams(List<String> words) {
        //All anagrams map to the same value when sorted lexicographically.
        //This algorithm does not care about duplicates (treats them as different strings).
        HashMap<String, List<String>> wordsByAnagram = new HashMap<>();

        for (String word: words) {
            char[] sortedCharArray = word.toCharArray();
            Arrays.sort(sortedCharArray);

            String anagram = String.valueOf(sortedCharArray);

            if (wordsByAnagram.containsKey(anagram)) {
                List<String> anagrams = wordsByAnagram.get(anagram);
                anagrams.add(word);
            } else {
                ArrayList<String> anagrams = new ArrayList<>();
                anagrams.add(word);
                wordsByAnagram.put(anagram, anagrams);
            }
        }

        ArrayList<List<String>> result = new ArrayList<>();

        for (List<String> anagrams: wordsByAnagram.values()) {
            result.add(anagrams);
        }

        return result;
    }
}
