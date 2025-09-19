/*Q3. Write a java program to print this pattern.

	1	2	3	4	5
	6	7	8	1	2
	3	4	5	6	7
	8	1	2	3	4	
	5	6	7	8	1

*/

public class Rect11Q3{
    public static void main(String args[]) {
        int c = 1;

        for (int i = 1; i <= 5; i++) { // rows
            for (int j = 1; j <= 5; j++) { // cols
                if (c<=8)
                {
                    System.out.print(c+"\t");
                       c++;
                } else {
                      c=1;
                    System.out.print( c + "\t");
                     c++;
                }
            }
            System.out.println();
        }
    }
}
