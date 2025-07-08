public class Task8 {

    // Varargs method to compute cumulative sum per parameter manually
    public static int cumulativeVarargsSum(int... numbers) {
        int totalSum = 0;

        for (int n : numbers) {
            int cumSum = 0;
            System.out.print("Cumulative sum for " + n + " = ");
            for (int i = 1; i <= n; i++) {
                cumSum += i;
                System.out.print(i);
                if (i < n) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + cumSum);
            totalSum += cumSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int result = cumulativeVarargsSum(4, 5, 10);
        System.out.println("Total Sum = " + result);
    }
}
