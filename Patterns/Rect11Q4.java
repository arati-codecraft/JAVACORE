/*Q4. Write a java program to print this pattern.

	1	2	3	4	5
	2	2	3	4	5
	3	3	3	4	5
	4	4	4	4	5
	5	5	5	5	5
*/

public class Rect11Q4{
    public static void main(String args[]) {
        int c = 1;

        for (int i = 1; i <= 5; i++) { // rows
            for (int j = 1; j <= 5; j++) { // cols
                if (j<=i) {
                    System.out.print(i+"\t");
                       c++;
                } else {
                    System.out.print( j+ "\t");
                   
                }
            }
            System.out.println();
        }
    }
}
