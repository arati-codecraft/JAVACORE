/*
Q5. Write a java program to print this pattern.

	#	1	#	2	#
	3	#	4	#	5
	#	6	#	7	#
	8	#	9	#	10
	#	11	#	12	#

*/
public class Rect11Q5 {
    public static void main(String args[]) {
        int c = 1;

        for (int i = 1; i <= 5; i++) { // rows
            for (int j = 1; j <= 5; j++) { // cols
                if ((i + j) % 2 == 0) {
                    System.out.print("#\t");
                } else {
                    System.out.print(c + "\t");
                    c++;
                }
            }
            System.out.println();
        }
    }
}