/*Q1. Write a java program to print this pattern.

						A
					B	A
				C	B	A
			D	C	B	A
		E	D	C	B	A
*/


import java.util.*;
public class Q1
{
   public static void main (String args[])
        {   char ch='A';
            for (int i=1;i<=5;i++)
                 {
                    char ch1=ch;
                    for (int j=1;j<=5;j++)
                        {
                            if (j>=6-i)
                            {
                            System.out.print (ch1--);
                             }
                            else {
                            System.out.print(" "); 
                            }
                                                            
                         }System.out.println();
                          ch++;
                  }
        }
 }