/*
Q6. Write a java program to print this pattern.

					1
                                 1	2	1	
                    	1	2	3	2	1
                 1	2	3	4	3	2	1
 			1	2	3	2	1	
                                 1	2	1	
                                        1
*/

public class Q6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            int row;
            if (i <= 5) {
                row = i;
            } else {
                row = 10 - i;
            }

            for (int j = 1; j <= 9; j++) {
                if (j < 6 - row || j > 4 + row) {
                    System.out.print("  ");
                } else {
                    int num;
                    if (j <= 5) {
                        num = j - (5 - row);
                    } else {
                        num = 10 - j - (5 - row);
                    }
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}