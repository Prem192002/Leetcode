import java.util.HashMap;
import java.util.Map;

public class fraction_to_recurring_decimal {
    public String fractionToDecimal(int numerator, int denominator) {
         if (numerator == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        result.append(num / den);
        long remainder = num % den;

        if (remainder == 0) {
            return result.toString();
        }

        result.append(".");
        Map<Long, Integer> remainderPositions = new HashMap<>();

        while (remainder != 0) {
            if (remainderPositions.containsKey(remainder)) {
                int nonRepeatingIndex = remainderPositions.get(remainder);
                String nonRepeating = result.substring(0, nonRepeatingIndex);
                String repeating = result.substring(nonRepeatingIndex);
                return nonRepeating + "(" + repeating + ")";
            }

            remainderPositions.put(remainder, result.length());
            remainder *= 10;
            result.append(remainder / den);
            remainder %= den;
        }

        return result.toString();
    }
    public static void main(String[] args) {
        fraction_to_recurring_decimal solution = new fraction_to_recurring_decimal();
        System.out.println(solution.fractionToDecimal(1, 2));    // Output: "0.5"
        System.out.println(solution.fractionToDecimal(2, 1));    // Output: "2"
        System.out.println(solution.fractionToDecimal(4, 333));  // Output: "0.(012)"
    }
}
