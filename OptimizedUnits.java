public class OptimizedUnits {
    public static void main(String[] args) {
        int[] units = {1, 2, 5, 10, 20, 50};
        int maxValue = 99;
        int totalUnitsUsed = 0;
        for (int value = 1; value <= maxValue; value++) {
            int remaining = value;
             for (int i = units.length - 1; i >= 0; i--) {
                 while (remaining >= units[i]) {
                     remaining -= units[i];
                    totalUnitsUsed++;
                 }
             }
        }
         System.out.println((double) totalUnitsUsed / maxValue);
    }
}
