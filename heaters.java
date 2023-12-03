import java.util.Arrays;

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

        // If the target is not found, return the closest heater
        if (low == 0) {
            return heaters[low];
        } else if (high == heaters.length - 1) {
            return heaters[high];
        } else {
            return Math.abs(heaters[low] - target) < Math.abs(heaters[high] - target) ? heaters[low] : heaters[high];
        }
    }
    public static void main(String[] args){
        heaters solution = new heaters();

        int[] houses1 = {1, 2, 3};
        int[] heaters1 = {2};
        System.out.println(solution.findRadius(houses1, heaters1));  

        int[] houses2 = {1, 2, 3, 4};
        int[] heaters2 = {1, 4};
        System.out.println(solution.findRadius(houses2, heaters2)); 

        int[] houses3 = {1, 5};
        int[] heaters3 = {2};
        System.out.println(solution.findRadius(houses3, heaters3));
    }
    
}