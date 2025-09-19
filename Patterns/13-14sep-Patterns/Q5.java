/*
Q5. Write a java program to print this pattern.
		  1
   	     2      2
  	3   		3
     4     		    4
5	5	5	5	5

*/

import java.util.*;
public class Q5
{
   public static void main (String args[])
        {
            for (int i=1;i<=5;i++)
                 {
                    for (int j=1;j<=9;j++)
                        {     
                               if ( j==6-i || j==4+i)
                                {
                                   System.out.print(i+"\t");
                                 }
                               else if (i==5&&(j==1||j==3||j==5||j==7))
                                {
                                     System.out.print(i+"   \t");
                                    
                                }
                              else
                                {
                                   System.out.print("\t");
                                 }

                              
                         }System.out.println();
                  }
        }
 }