/*

Q7. Write a java program to print this pattern.

			  	1
                           1	     1
                      1       2	1
                  1	  3       3        1
               1	 4	6	4	1

*/

public class Q7 {
    public static void main(String[] args) {
        int rows = 5;

        	for (int i = 0; i < rows; i++) 
         	{
            		int num = 1;

            	int spaceCount = rows - i;
            	while (spaceCount > 0) 
       			 {  
               		 System.out.print(" ");
                	  spaceCount--;
           		 }

            for (int j = 0; j <= i; j++)
               {
                
                	if (j > 0) {
                   		 System.out.print(" ");
               			 }

                	System.out.print(num);
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

