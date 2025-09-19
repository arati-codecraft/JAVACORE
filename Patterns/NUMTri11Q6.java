/*
Q6. Write a java program to print this pattern.

	1
	2	3
	4		5
	6			7
	8	9	10	11	12

*/

import java.util.*;

public class NUMTri11Q6 {
    public static void main(String args[]) {
        int count = 1;
        int n = 5; // number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // first column, diagonal, or last row
                if (j == 1 || j == i || i == n) {
                    System.out.print(count + "\t");
                    count++;
                } else {
                    System.out.print("\t"); // space in between
                }
            }
            System.out.println();
        }
    }
}