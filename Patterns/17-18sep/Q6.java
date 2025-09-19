/*
Q6. Write a java program to print this pattern.

	1	A	2	B	3
	C	4	D	5	E
	6	F	7	G	8
	H	9	I	10	J
	11	K	12	L	13
*/

import java.util.*;
public class Q6
{
   public static void main (String args[])
        {
             int c=1;
             int ch='A';
            for (int i=0;i<5;i++)
                 {  
                    for (int j=0;j<5;j++)
                        {    
                            if((i+j)%2!=0)
                             {
                                  System.out.print((char)(ch)+"\t");  
                                    ch++;  
                              }
                             else
                              {
                                 System.out.print(c+"\t");
                                   c++; 
                               } 
                                 
                            
                          }System.out.println();
                          
                          
                  }
        }
 }