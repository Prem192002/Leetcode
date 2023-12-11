
import java.util.*;
public class Distribute_candies_Q575 {
    public int distributeCandies(int[] candyType) {
        int maxTypes = candyType.length / 2;
        HashSet<Integer> uniqueCandies = new HashSet<>();

        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }

        return Math.min(uniqueCandies.size(), maxTypes);
    }
    public static void main(String[] args){

    }
}
