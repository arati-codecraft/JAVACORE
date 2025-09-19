/*
Q5. Write a java program to print this pattern.

	5	*	5	*	5
	4	*	4	*
	3	*	3
	2	*
	1
*/

import java.util.*;
public class NUMTriH5Q5
{
	public static void main (String args[])
		{
                      Scanner sc=new Scanner(System.in);
                      int count =1;
                      for (int i=5;i>=1;i--)
                           {
                                for(int j=1;j<=i;j++)
                                      {
                                         if(j%2==1)
                                       System.out.print(i+"\t");
                                          else
                                       System.out.print("*\t");
                                                                              
                                       }System.out.println();
                            }   
		}
}