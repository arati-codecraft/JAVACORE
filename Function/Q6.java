//Q6. Write a java program to find the sum of all natural numbers between 1 to n

import java.util.*;
public class Q6
{
  public static void SumNatNum(int lim)
  {  int sum=0;
    for(int i=1;i<=lim;i++)
	{
	  
	  sum=sum+i;
	}
	System.out.println("sum =" + sum);
  }
  public static void main (String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the lim to find the sum of natural number upto lim");
   int lim=sc.nextInt();
   SumNatNum(lim);
  }
}