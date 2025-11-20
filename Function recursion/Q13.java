//Q13. Write a java program to enter a number and print its reverse.

import java.util.*;

public class Q13
{ static int rev=0;
  public static void RevNum(int n)
  {
    if(n>0)
	{
	  rev=rev*10+n%10;
	  n /=10;
	  RevNum(n);
	}
	else
	{
		System.out.println("reversed number = "+rev);
	}
  }
  public static void main (String args[])
  {
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter the number");
   int num=sc.nextInt();
   RevNum(num);
  }
}