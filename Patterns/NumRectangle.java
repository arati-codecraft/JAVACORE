/*
Q2. Write a java program to print this pattern.

	1	2	3	4	5
	2	3	4	5	6
	3	4	5	6	7
	4	5	6	7	8
	5	6	7	8	9
*/

import java.util.*;
public class NumRectangle
{
     public static void main (String args[])
          {
             for (int i=1;i<=9;i++)
                 {
                     for(int j=1;j<=5;j++)
                       {
                           System.out.print(j+"\t");
                          
                        }
                      System.out.println();
                  }
           }
}