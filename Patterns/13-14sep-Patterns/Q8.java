
/*
Q8. Write a java program to print this pattern.

	    		1
   		     1       1
    		1   		1
 	     1     		     1
          1	2	3	4	1

*/

import java.util.*;

public class Q8 
   {
    public static void main(String args[]) 
         {
        for (int i = 1; i <= 5; i++) {
            int c = 1;  
            for (int j = 1; j <= 9; j++) {

                if (j == 6 - i || j == 4 + i) 
                   {
                    
                    System.out.print("1\t");
                   } 
               else if (i == 5 && j > 1 && j < 9 && j % 2 == 1) 
                   {
                    
                    System.out.print((c + 1) + "\t");
                    c++; 
                  } 
                else 
                    {
                    System.out.print("\t");                 }

                      }
            System.out.println();
        }
    }
}





