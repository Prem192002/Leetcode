import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Substring_with_concatination {
     public List<Integer> findSubstring(String s, String[] words) {
         List<Integer> result = new ArrayList<>();
        
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }
        
        int wordLength = words[0].length();
        int totalLength = words.length * wordLength;
        Map<String, Integer> wordCount = new HashMap<>();
        
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        for (int i = 0; i <= s.length() - totalLength; i++) {
            Map<String, Integer> seen = new HashMap<>();
            int count = 0;
            int start = i;
            for (int j = i; j < i + totalLength; j += wordLength) {
                String word = s.substring(j, j + wordLength);
                if (wordCount.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    count++;
                    
                    while (seen.get(word) > wordCount.getOrDefault(word, 0)) {
                        String startWord = s.substring(start, start + wordLength);
                        seen.put(startWord, seen.get(startWord) - 1);
                        count--;
                        start += wordLength;
                    }
                    
                    if (count == words.length) {
                        result.add(start);
                    }
                } else {
                    break;
                }
            }
        }
        
        return result;
    }
}
