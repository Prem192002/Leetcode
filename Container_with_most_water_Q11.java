public class Container_with_most_water_Q11 {
    
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int maxWater = 0;
    
            while (left < right) {
                int h = Math.min(height[left], height[right]);
                int w = right - left;
                maxWater = Math.max(maxWater, h * w);
    
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
            }
    
            return maxWater;
        }
    
        public static void main(String[] args) {
            Container_with_most_water_Q11 solution = new Container_with_most_water_Q11();
    
            // Example usage:
            int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
            System.out.println(solution.maxArea(height1)); // Output: 49
    
            int[] height2 = {1, 1};
            System.out.println(solution.maxArea(height2)); // Output: 1
        }
    }
    

