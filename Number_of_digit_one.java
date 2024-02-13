public class Number_of_digit_one {
    public int countDigitOne(int n) {
        int count = 0;
        for (long i = 1; i <= n; i *= 10) {
            long divider = i * 10;
            count += (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0), i);
        }
        return count;
    }
    public static void main(String[] args) {
        Number_of_digit_one solution = new Number_of_digit_one();
        
        System.out.println(solution.countDigitOne(13)); 
        System.out.println(solution.countDigitOne(0));   
    }

}
