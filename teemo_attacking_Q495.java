public class teemo_attacking_Q495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0 || duration == 0) {
           return 0;
       }

       int totalDuration = 0;
       
       for (int i = 1; i < timeSeries.length; i++) {
           int gap = timeSeries[i] - timeSeries[i - 1];
           totalDuration += Math.min(gap, duration);
       }
       totalDuration += duration;

       return totalDuration;
   }
   public static void main(String[] args) {
    teemo_attacking_Q495 solution = new teemo_attacking_Q495();

    // Example 1:
    int[] timeSeries1 = {1, 4};
    int duration1 = 2;
    System.out.println(solution.findPoisonedDuration(timeSeries1, duration1));  // Output: 4

    // Example 2:
    int[] timeSeries2 = {1, 2};
    int duration2 = 2;
    System.out.println(solution.findPoisonedDuration(timeSeries2, duration2));  // Output: 3
}
}
