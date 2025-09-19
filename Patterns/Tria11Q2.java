/*
Q2. Write a java program to print this pattern.

    1
    3   3   3
    5   5   5   5   5
    3   3   3
    1
*/

public class Tria11Q2 {
    public static void main(String args[]) {
        int n = 5; // total rows
        int num = 1;

        for (int i = 1; i <= n; i++) {
            // decide how many times to print in this row
            int cols;
            if (i == 1 || i == 5) {
                cols = 1;
            } else if (i == 2 || i == 4) {
                cols = 3;
            } else {
                cols = 5;
            }

            for (int j = 1; j <= cols; j++) {
                System.out.print(num + "\t");
            }
            if (i < 3) {
                num += 2; // increasing till middle
            } else {
                num -= 2; // decreasing after middle
            }

            System.out.println();
        }
    }
}
