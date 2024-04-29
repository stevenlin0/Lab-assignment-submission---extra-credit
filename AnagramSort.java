import java.util.*;

public class AnagramSort {
    public static List<String> sortAnagrams(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            // Convert the word to a character array and sort it
            char[] charSeq = word.toCharArray();
            Arrays.sort(charSeq);
            // Convert the sorted character array back to a string
            String sortedWord = new String(charSeq);
            // Check if the map already contains the sorted word as a key
            if (map.containsKey(sortedWord)) {
                // If it does, add the original word to the list of anagrams for that key
                map.get(sortedWord).add(word);
            } else {
                // If not, create a new list, add the original word to it, and put it in the map with the sorted word as the key
                List<String> anagrams = new ArrayList<>();
                anagrams.add(word);
                map.put(sortedWord, anagrams);
            }
        }
        // Create a new list to store the sorted anagrams
        List<String> sortedList = new ArrayList<>();
        for (List<String> anagrams : map.values()) {
            for (String word : anagrams) {
                sortedList.add(word);
            }
        }

        return sortedList;
    }

    public static void main(String[] args) {
        String[] words = {"god", "dog", "abc", "cab", "man"};
        List<String> sortedAnagrams = sortAnagrams(words);
        System.out.println(sortedAnagrams);
    }
}