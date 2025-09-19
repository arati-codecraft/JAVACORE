/*Q11. Write a java program to print this pattern.

	A	A	A	A	A
	B	B	B	B	B
	C	C	C	C	C
	D	D	D	D	D
	E	E	E	E	E
*/

import java.util.*;
public class Q11
{
   public static void main (String args[])
        {
            for (int i=0;i<5;i++)
                 {
                    for (int j=0;j<5;j++)
                        {
                           
                            System.out.print((char) ('A'+i)+"\t");
                                
                                                            
                         }System.out.println();
                  }
        }
 }