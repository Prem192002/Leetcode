public class Palindrome_number {
    public boolean isPalindrome(int x) {
        String strX = Integer.toString(x);
       return strX.equals(new StringBuilder(strX).reverse().toString());

   }

   public static void main(String[] args){
    Palindrome_number obj = new Palindrome_number();
    boolean result = obj.isPalindrome(121);
    System.out.println(result);
   }
}
