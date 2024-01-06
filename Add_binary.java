public class Add_binary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int maxLength = Math.max(a.length(), b.length());
        a = String.format("%" + maxLength + "s", a).replace(' ', '0');
        b = String.format("%" + maxLength + "s", b).replace(' ', '0');
        for (int i = maxLength - 1; i >= 0; i--) {
            int bitSum = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + carry;
            result.insert(0, bitSum % 2);
            carry = bitSum / 2;
        }

        if (carry > 0) {
            result.insert(0, '1');
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Add_binary solution = new Add_binary();
        String a1 = "11";
        String b1 = "1";
        String result1 = solution.addBinary(a1, b1);
        System.out.println("Input: a = \"" + a1 + "\", b = \"" + b1 + "\"");
        System.out.println("Output: \"" + result1 + "\"");
        System.out.println();
    }
}
