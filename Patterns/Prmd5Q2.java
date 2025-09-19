/*Q2. Write a java program to print this pattern.
			
			1
		     1      2
	 	1	2	3
             1	     2	     3     4
	1	2	3	4	5
*/

import java.util.*;
public class Prmd5Q2
{
      public static void main(String args[])
        {
            Scanner sc=new Scanner (System.in);
            

            for (int i=0;i<=5;i++)
                 {
                    for (int j=1;j<=2*i-1;j++)
                        {
                              System.out.print("*\t");
                         }System.out.println();
                 }
         }
}