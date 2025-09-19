/*
Q9. Write a java program to print this pattern.

	1
	2	*	2
	3	*	3	*	3
	4	*	4	*	4	*	4
	3	*	3	*	3
	2	*	2
	1
*/

public class Tri11Q9 {
    public static void main(String[] args)
  {
        int n = 4; 
        for (int i = 1; i <= 2 * n - 1; i++)
            {
           	 int count;
       		if (i <= n)
              	   {
                      count = i;          
                    }
               else 
                   {
                    count = 2 * n - i;  
                    }

                  for (int j = 1; j <= count; j++) {
                   System.out.print(count);
                    if (j < count) 
                     {
                    System.out.print("\t*\t"); 
                      }
                 }
            System.out.println();
        }
    }
}
