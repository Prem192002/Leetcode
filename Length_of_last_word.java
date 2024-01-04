public class Length_of_last_word {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        if (words.length == 0) {
            return 0;
        }
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        Length_of_last_word solution = new Length_of_last_word();

        String input1 = "Hello World";
        int output1 = solution.lengthOfLastWord(input1);
        System.out.println("Input: " + input1 + "\nOutput: " + output1 + "\n");

        String input2 = "   fly me   to   the moon  ";
        int output2 = solution.lengthOfLastWord(input2);
        System.out.println("Input: " + input2 + "\nOutput: " + output2 + "\n");

        String input3 = "luffy is still joyboy";
        int output3 = solution.lengthOfLastWord(input3);
        System.out.println("Input: " + input3 + "\nOutput: " + output3);
    }
}
