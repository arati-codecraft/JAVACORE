/*
Q2. Write a java program to print this pattern.

*	*	*	*	*
*	*	*	*	#
*	*	*	#	#
*	*	#	#	#
*	#	#	#	#
*/


import java.util.*;
public class  RectQ2
{
       public static void main (String args[])
       {
      Scanner sc=new Scanner (System.in);
     
       
       for (int i=1; i<=5; i++)
         {
               for (int j=1; j<=5 ; j++)
              {
                  if(j <=7- i - 1)

                    {
                       System.out.print("*\t");
                     }
                      else
                       {
                          System.out.print("#\t");
                       }
                   
               }  
              System.out.println( );
          }
     }
}