class String_to_integer{
    public int myAtoi(String s) {
        int INT_MAX = Integer.MAX_VALUE;
        int INT_MIN = Integer.MIN_VALUE;
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        int sign = 1;
        if (i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        int num = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = Character.getNumericValue(s.charAt(i));
            if (num > (INT_MAX - digit) / 10) {
                return (sign == 1) ? INT_MAX : INT_MIN;
            }
            num = num * 10 + digit;
            i++;
        }
        int result = num * sign;
        if (result > INT_MAX) {
            return INT_MAX;
        } else if (result < INT_MIN) {
            return INT_MIN;
        } else {
            return result;
        }
    }
    public static void main(String[] args){
        String_to_integer solution = new String_to_integer();
            String input1 = "42";
            int result1 = solution.myAtoi(input1);
            System.out.println("Result 1: " + result1);

            String input2 = "   -123";
            int result2 = solution.myAtoi(input2);
            System.out.println("Result 2: " + result2);

            String input3 = "2147483648";
            int result3 = solution.myAtoi(input3);
            System.out.println("Result 3: " + result3);
    }
}