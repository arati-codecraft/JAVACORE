/*
Q3. Write a java program to print this pattern.

	1
	2	3
	4	5	6
	7	8	9	10
	11	12	13	14	15
*/

import java.util.*;
public class NUMTri5Q3
{
	public static void main (String args[])
		{
                      Scanner sc=new Scanner(System.in);
                      int count =1;
                      for (int i=1;i<=5;i++)
                           {
                                for(int j=1;j<=5;j++)
                                      {
                                           if(i>=j)
                                                {
                                          System.out.print(count+"\t");
                                            ++count; 
                                              }                                      
                                       }System.out.println();
                            }   
		}
}