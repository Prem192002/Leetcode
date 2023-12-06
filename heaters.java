import java.util.*;
class heaters{
    public int findRadius(int[] houses, int[] heaters) {
         Arrays.sort(houses);
        Arrays.sort(heaters);
        
        int minRadius = 0;
        
        for (int house : houses) {
            int closestHeater = binarySearchClosestHeater(heaters, house);
            int distance = Math.abs(house - closestHeater);
            minRadius = Math.max(minRadius, distance);
        }
        
        return minRadius;
    }

    private int binarySearchClosestHeater(int[] heaters, int target) {
        int low = 0;
        int high = heaters.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (heaters[mid] == target) {
                return heaters[mid];
            } else if (heaters[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (low == 0) {
            return heaters[low];
        } else if (high == heaters.length - 1) {
            return heaters[high];
        } else {
            return Math.abs(heaters[low] - target) < Math.abs(heaters[high] - target) ? heaters[low] : heaters[high];
        }
    }
    public static void main(String[] args){
        
    }
}