/*
Q15. Write a java program to print this pattern.

	E	E	E	E	E
	D	D	D	D
	C	C	C
	B	B
	A

*/

import java.util.*;
public class Q15
{
   public static void main (String args[])
        {
            for (int i=5;i>0;i--)
                 {
                    for (int j=0;j<i;j++)
                        {
                           
                            System.out.print((char) ('A'+i-1)+"\t");
                                
                                                            
                         }System.out.println();
                  }
        }
 }