/*Q1. Write a java program to print this pattern.

					1	
				2	3	2
			3	4	5	4	3
                 4	5	6	7	6	5	4
	5	6	7	8	9	8	7	6	5
*/

public class Prmd11Q1 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int c = i;

            for (int j = 1; j <= 2 * n - 1; j++)
                 {
                if (j < n - i + 1)
                    {
                    
                    System.out.print("  ");
                       } 
               else if (j <= n + i - 1) 
                      {
                  
                    System.out.print(c + " ");
                    if (j < n) 
                     {
                        c++;
                    } 
                   else {
                        c--; 
                    }
                }
            }
            System.out.println();
        }
    }
}