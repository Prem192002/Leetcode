class Reverse_integer {
    public static int reverse(int x) {
        int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);

        int reversedNumber = 0;
        while (x > 0) {
            int lastDigit = x % 10;
            x = x / 10;
            if (reversedNumber > Integer.MAX_VALUE / 10 || (reversedNumber      == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0;
            }
            if (reversedNumber < Integer.MIN_VALUE / 10 || (reversedNumber ==     Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0;
            }

            reversedNumber = reversedNumber * 10 + lastDigit;
        }

        return sign * reversedNumber;
    }
    public static void main(String[] args){
        Reverse_integer solution = new Reverse_integer();

    // Test cases
    int x1 = 123;
    System.out.println("Input: " + x1 + " | Output: " + solution.reverse(x1));

    int x2 = -123;
    System.out.println("Input: " + x2 + " | Output: " + solution.reverse(x2));

    int x3 = 120;
    System.out.println("Input: " + x3 + " | Output: " + solution.reverse(x3));
    
    }
}