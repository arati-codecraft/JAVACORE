/*
Q5. Write a java program to print this pattern.

	1
	A	B
	1	2	3
	A	B	C	D
	1	2	3	4	5
*/

import java.util.*;
public class Q5
{
   public static void main (String args[])
        {
            for (int i=0;i<5;i++)
                 {  int c=1;
                    for (int j=0;j<5;j++)
                        {
                             if(j<=i&&i%2==0)
                            System.out.print((char) ('A'+j)+"\t");
                             else if(j<=i&&i%2==1)
                               {
                                  System.out.print(c++ +"\t");
                                }
                             else
                              System.out.print("\t"); 
                                                       
                         }System.out.println();
                  }
        }
 }