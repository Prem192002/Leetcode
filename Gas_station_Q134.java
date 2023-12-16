public class Gas_station_Q134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0;
        int currentGas = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            int diff = gas[i] - cost[i];
            totalGas += diff;
            currentGas += diff;

            if (currentGas < 0) {
                start = i + 1;
                currentGas = 0;
            }
        }

        return (totalGas >= 0) ? start : -1;
    }

    public static void main(String[] args){
        
    }
}
