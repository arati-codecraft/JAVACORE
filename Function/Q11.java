//Q11. Write a java program to calculate the sum of digits in a number.

import java.util.*;

public class Q11
{
  public static void DigitSum(int no)
  {
   
    int count =0;
	int sum =0;
	int digit=0;
    while(no!=0)
	{
	  digit=no%10;
	  sum=sum+digit;
	  no /=10;
	}
    System.out.println("sum of all digit="+ sum);
  }
  public static void main (String args[])
  {
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter the number ");
   int no=sc.nextInt();
   DigitSum(no);
  }
}