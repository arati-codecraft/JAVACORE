/*

Q4. Write a java program to print this pattern.
	
	A	1	2	3	4
	A	B	1	2	3
	A	B	C	1	2
	A	B	C	D	1
	A	B	C	D	E
*/

import java.util.*;
public class Q4
{
   public static void main (String args[])
        {
            for (int i=0;i<5;i++)
                 {  int c=0;
                    for (int j=0;j<5;j++)
                        {
                             if(j<=i)
                            System.out.print((char) ('A'+j)+"\t");
                             else
                              System.out.print((c-i)+"\t"); 
                              c++;                           
                         }System.out.println();
                  }
        }
 }