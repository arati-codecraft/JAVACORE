/*
Q4. Write a java program to print this pattern.

	*	*	*	*	*	*	*
	*	*				*	*
	*		*		*		*
	*			*			*
	*		*		*		*
	*	*				*	*
	*	*	*	*	*	*	*
	
*/

import java.util.*;
public class StrDiagRecH4Q4
{
     public static void main (String args[])
          {
             for (int i=1;i<=7;i++)
                 {
                     for(int j=1;j<=7;j++)
                       {
                            if(i==j||j==8-i||i==1||i==7||j==7||j==1)
                            {
                               System.out.print("*\t");
                            }  
                           else
                            {
                                System.out.print("\t");
                            }            
                        }
                      System.out.println();
                  }
           }
}