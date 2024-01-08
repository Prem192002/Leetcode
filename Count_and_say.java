public class Count_and_say {
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String prev = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();

        int count = 1;
        char currentDigit = prev.charAt(0);

        for (int i = 1; i < prev.length(); i++) {
            if (prev.charAt(i) == currentDigit) {
                count++;
            } else {
                result.append(count).append(currentDigit);
                count = 1;
                currentDigit = prev.charAt(i);
            }
        }
        result.append(count).append(currentDigit);
        return result.toString();
    }
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 4;

        System.out.println(countAndSay(n1)); // Output: "1"
        System.out.println(countAndSay(n2)); // Output: "1211"
    }

}
