import java.util.*;
public class test {
    
    public static void doSomething(String a) {
        int totalChars = a.length();
        int uppercaseCount = 0, lowercaseCount = 0,digitCount=0, otherCount=0;
        for(char ch:a.toCharArray()){
            if(Character.isUpperCase(ch)){
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)){
                lowercaseCount++;
            } else if (Character.isDigit(ch)){
                digitCount++;
            } else {
                otherCount++;
            }
        }
        
        double uppercasePercentage = (uppercaseCount * 100.0)/totalChars;
        double lowercasePercentage = (lowercaseCount * 100.0)/totalChars;
        double digitPercentage = (digitCount * 100.0)/totalChars;
        double otherPercentage = (otherCount * 100.0)/totalChars;
        
        System.out.printf("%.3f%% %.3f%% %.3f%% %.3f%%\n", uppercasePercentage,lowercasePercentage,digitPercentage,otherPercentage);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        doSomething(a);
    }
}