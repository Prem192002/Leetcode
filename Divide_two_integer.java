public class Divide_two_integer {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Overflow case
        }

        // Determine the sign of the result
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        // Convert both dividend and divisor to positive
        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);

        // Initialize the quotient
        long quotient = 0;

        // Perform the division
        while (ldividend >= ldivisor) {
            long temp = ldivisor, multiple = 1;
            // Use left shift to find the largest multiple of divisor
            while (ldividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            // Subtract the largest multiple of divisor
            ldividend -= temp;
            // Add the multiple to the quotient
            quotient += multiple;
        }

        // Apply the sign to the result
        quotient *= sign;

        return (int) Math.max(Math.min(quotient, Integer.MAX_VALUE), Integer.MIN_VALUE);
    }
    public static void main(String[] args) {
        Divide_two_integer solution = new Divide_two_integer();

        // Test cases
        int result1 = solution.divide(10, 3);
        System.out.println("Result 1: " + result1);  // Output: 3

        int result2 = solution.divide(7, -3);
        System.out.println("Result 2: " + result2);  // Output: -2
    }
}
