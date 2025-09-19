/*
Q74. Write a java program to print this pattern.

A
A	B	A
A	B	C	B	A
A	B	C	D	C	B	A
A	B	C	D	E	D	C	B	A
*/

import java.util.*;
public class Q10
{
   public static void main (String args[])
        {  
            for (int i=1;i<=5;i++)
                 {   char ch='A';
                      for (int j=1;j<=2*i-1;j++)
                        {
                            if (j<=i)
                            {
                            System.out.print ((char)('A'+j-1)+"\t");
                             ch++;
                             }
                            else {
                            System.out.print((char)('A'+(2*i-j-1))+"\t");
                            
                            }
                                                            
                         }System.out.println();
                         
                  }
        }
 }