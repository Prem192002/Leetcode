class integer_to_roman{
    public String intToRoman(int num) {
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] syb = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNum = new StringBuilder();
        int i = 0;

        while (num > 0) {
            int count = num / val[i];
            for (int j = 0; j < count; j++) {
                romanNum.append(syb[i]);
                num -= val[i];
            }
            i++;
        }

        return romanNum.toString();
    }

    // Example usage:
    public static void main(String[] args) {
        integer_to_roman solution = new integer_to_roman();
        System.out.println(solution.intToRoman(3));      // Output: "III"
        System.out.println(solution.intToRoman(58));     // Output: "LVIII"
        System.out.println(solution.intToRoman(1994));   // Output: "MCMXCIV"
    }
}