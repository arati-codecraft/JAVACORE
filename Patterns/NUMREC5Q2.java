/*Q2. Write a java program to print this pattern.

	1	2	3	4	5
	2	3	4	5	6
	3	4	5	6	7
	4	5	6	7	8
	5	6	7	8	9
*/

import java.util.*;
public class NUMREC5Q2
{
	public static void main (String args[])
		{
                      Scanner sc=new Scanner(System.in);
                      
                      for (int i=1;i<=5;i++)
                           {
                                for(int j=i;j<i+5;j++)
                                      {
                                          System.out.print(j+"\t");                                       
                                       }System.out.println();
                            }   
		}
}