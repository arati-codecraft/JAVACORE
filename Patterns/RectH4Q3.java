/*

Q3. Write a java program to print this pattern.

	#	*	*	*	#
	*	#	*	#	*
	*	*	#	*	*
	*	#	*	#	*
	#	*	*	*	#
*/

import java.util.*;
public class RectH4Q3
{
     public static void main (String args[])
          {
             for (int i=1;i<=5;i++)
                 {
                     for(int j=1;j<=5;j++)
                       {
                           if(i==j||j==6-i)
                            {
                               System.out.print("#\t");
                            }  
                           else
                            {
                                System.out.print("*\t");
                            }                        
                        }
                      System.out.println();
                  }
           }
}