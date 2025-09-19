/*
Q5. Write a java program to print this pattern.

	#
	#	*
	#	*	#
	#	*	#	*
	#	*	#	*	#
	#	*	#	*
	#	*	#	
	#	*
	#	


*/

import java.util.*;
public class PrmdhmQ5
{
     public static void main (String args[])
       {
            for (int i=1 ; i<=9; i++)
               {
                    for (int j=1 ; j<=5; j++)
                       {
                          if(j==1||j==2-i)
                           {
                            System.out.print("#\t");
                            }
                           else 
                            {
                               System.out.print("\t");

                             }
                        }
                     System.out.println( );
                }
        }
}