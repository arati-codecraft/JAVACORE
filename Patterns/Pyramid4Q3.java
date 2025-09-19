/*
Q3. Write a java program to print this pattern.

	*						*
	*	*				*
	*	*	*		*
	*	*	*	*
	*	*	*	*	*
	*	*	*	*	*	*
	*	*	*	*	*	*	*
*/

import java.util.*;
public class Pyramid4Q3
{
     public static void main (String args[])
          {
             for (int i=1;i<=7;i++)
                 {
                     for(int j=1;j<=7;j++)
                       {
                           if(j<=i||j==8-i)
                            {
                                 System.out.print("*\t");
                             }
                            else
                              {
                                 System.out.print("\t");
                               }
                        }System.out.println();
                  }
           }
}