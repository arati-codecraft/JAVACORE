/*
Q10. Write a java program to print this pattern.

1        								1
1	2							2	1
1	2	3					3	2	1
1	2	3	4			4	3	2	1
1	2	3	4	5	5	4	3	2	1

*/

public class Q10 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) 
           {
            
            for (int j = 1; j <= 2 * n; j++)
                {
                if (j <= i) 
                 {  
                    
                    System.out.print(j + "\t");
                      }
                       else if (j >= 2 * n - i + 1)
                           {  
                    
                        System.out.print((2 * n - j + 1) + "\t");
                       }
                      else   
                       {
                        System.out.print("\t");
                        }
            }
            System.out.println();
        }
    }
}
