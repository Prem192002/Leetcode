import java.util.HashMap;
import java.util.Map;

public class Valid_anagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> charCountS = new HashMap<>();
        Map<Character, Integer> charCountT = new HashMap<>();

        for (char ch : s.toCharArray()) {
            charCountS.put(ch, charCountS.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            charCountT.put(ch, charCountT.getOrDefault(ch, 0) + 1);
        }
        return charCountS.equals(charCountT);
    }

    public static void main(String[] args) {
        Valid_anagram solution = new Valid_anagram();
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(solution.isAnagram(s1, t1));

        String s2 = "rat";
        String t2 = "car";
        System.out.println(solution.isAnagram(s2, t2));
    }
}
