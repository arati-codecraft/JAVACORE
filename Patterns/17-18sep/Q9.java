/*
Q9. Write a java program to print this pattern.
		
	A	B	C	D	E
		1	2	3	4
			A	B	C
				1	2
					A
*/

import java.util.*;
public class Q9
{
   public static void main (String args[])
        {
            for (int i=0;i<5;i++)
                 {  int c=1;
                    for (int j=0;j<5;j++)
                        {
                             if(j>=i && i%2==0)
                            System.out.print((char) ('A'+j)+"\t");
                             else if(j>=i && i%2==1)
                               {
                                  System.out.print(c++ +"\t");
                                }
                             else
                              System.out.print("\t"); 
                                                       
                         }System.out.println();
                  }
        }
 }