public class Reverse_bits {
    public int reverseBits(int n) {
        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            reversed <<= 1; 
            reversed |= (n & 1); 
            n >>>= 1; 
        }
        return reversed;
    }
    public static void main (String[] args){
    Reverse_bits solution = new Reverse_bits();
        
        int n1 = 0b00000010100101000001111010011100;
        int n2 = 0b11111111111111111111111111111101;
        
        System.out.println("Input: " + Integer.toBinaryString(n1));
        System.out.println("Output: " + Integer.toBinaryString(solution.reverseBits(n1)));
        
        System.out.println("Input: " + Integer.toBinaryString(n2));
        System.out.println("Output: " + Integer.toBinaryString(solution.reverseBits(n2)));
    }
}
