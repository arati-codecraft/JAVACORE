/*
Q1. Write a java program to print this pattern.

	5	4	3	2	1
		4	3	2	1
			3	2	1	
				2	1	
					1
*/

import java.util.*;
public class NUMTriH5Q1
{
	public static void main (String args[])
		{
                      Scanner sc=new Scanner(System.in);
                      int count =1;
                      for (int i=5;i>=1;i--)
                           {
                                for(int j=i;j>=1;j--)
                                      {
                                          System.out.print(j+"\t");
                                            
                                                                             
                                       }System.out.println();
                            }   
		}
}