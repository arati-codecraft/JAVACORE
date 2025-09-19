/*
Q1. Write a java program to print this pattern.

				1
			2	2
		3	3	3
	4	4	4	4
                3	3	3	
                        2	2
                                1
*/

import java.util.*;
public class Q1
{
          public static void main (String args[])
            {
                   for(int i=1;i<=7;i++)
                         {
                            for(int j=1;j<=4;j++)
                                   {
                                        if((i<=4&&j>4-i))
                                             {
                                                 System.out.print(i+"\t");
                                              }
                                         else if((i>4&&j>i-4))
                                              {
                                                 System.out.print((8-i)+"\t");
                                               }
                                         else 
                                            {
                                              System.out.print("\t");
                                            }
                                    }System.out.println();
                            
                          }
            }
}
