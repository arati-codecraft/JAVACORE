//Q8. Write a java program to find the sum of all odd numbers between 1 to n.

import java.util.*;
public class Q8
{
  public static void SumOddNum(int lim)
  {  int sum=0;
    for(int i=1;i<=lim;i++)
	{
	  if(i%2!=0)
	   {
	    sum=sum+i;
		}
	}
	System.out.println("sum =" + sum);
  }
  public static void main (String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the lim to find the sum of Odd number upto lim");
   int lim=sc.nextInt();
   SumOddNum(lim);
  }
}