/*
Q1. Write a java program to print this pattern.

				*
			*	*	*
		*		*		*
	*			*			*
*	*	*	*	*	*	*	*	*
	*			*			*
		*		*		*
			*	*	*
				*

*/

import java.util.*;
public class Rect41
{
     public static void main (String args[])
          {
             for (int i=1;i<=9;i++)
                 {
                     for(int j=1;j<=9;j++)
                       {
                           if(i==5||j==5||j==4+i||i==4+j||i==6-j||i+j==14)
                            {
                                 System.out.print("*");
                             }
                            else
                              {
                                 System.out.print(" ");
                               }
                        }System.out.println();
                  }
           }
}