public class Shortest_palindrpme {
    public String shortestPalindrome(String s) {

        String rev = new StringBuilder(s).reverse().toString();
        String temp = s + "#" + rev;
        
        int[] table = new int[temp.length()];

        // create KMP table
        for (int i = 1; i < temp.length(); i++) {
            int j = table[i - 1];
            while (j > 0 && temp.charAt(i) != temp.charAt(j)) j = table[j - 1];
            if (temp.charAt(i) == temp.charAt(j)) table[i] = j + 1;
        }

        return rev.substring(0, s.length() - table[temp.length() - 1]) + s;


    }
    public static void main(String[] args) {
        Shortest_palindrpme  solution = new Shortest_palindrpme();
        
        String input1 = "aacecaaa";
        String input2 = "abcd";
        
        System.out.println(solution.shortestPalindrome(input1));  // Output: "aaacecaaa"
        System.out.println(solution.shortestPalindrome(input2));  // Output: "dcbabcd"
    }
}
