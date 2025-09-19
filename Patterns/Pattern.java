public class Pattern {
    public static void main(String[] args) {
        int n = 5;   // middle row length

        for (int i = 1; i <= 2 * n - 1; i++) {   // total rows
            int cols = i <= n ? i : 2 * n - i;   // increasing then decreasing
            for (int j = 1; j <= cols; j++) {
                if (j % 2 == 0)
                    System.out.print("* ");
                else
                    System.out.print("# ");
            }
            System.out.println();
        }
    }
}
