/*

Q67. Write a java program to print this pattern.

	A	B	C	D	E
	     A	     B	     C      D
		A	B	C
		     A	     B
			A
*/

import java.util.*;
public class Q3
{
   public static void main (String args[])
        {  
            for (int i=5;i>=1;i--)
                 {
                       char ch='A';
                  
                      boolean flag =false;
                    for (int j=1;j<=10;j++)
                        {
                            if (j>6-i && j<6+i && flag)
                            {
                            System.out.print ((char)ch+" ");
                               flag=false;
                                ch++;   

                             }
                            else {
                            System.out.print("  "); 
                             flag=true;
                            }
                                                      
                         }System.out.println();
                        
                  }
        }
 }
