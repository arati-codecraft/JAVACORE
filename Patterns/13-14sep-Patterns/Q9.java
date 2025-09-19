/*Q9. Write a java program to print this pattern.

	1       					       9
            2     					8
  		3				7
   			4		6
                               5
   			4 		6
  		3   				7
         2     					8
1       							9

*/


import java.util.*;
public class Q9
{
   public static void main (String args[])
        {
            for (int i=1;i<=9;i++)
                 {
                    for (int j=1;j<=9;j++)
                        {
                            if (j==10-i||j==i)
                                {
                                   System.out.print(j+"\t");
                                 }
                              else
                                {
                                   System.out.print("\t");
                                 }

                              
                         }System.out.println();
                  }
        }
 }