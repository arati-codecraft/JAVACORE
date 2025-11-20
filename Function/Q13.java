//Q13. Write a java program to enter a number and print its reverse.

import java.util.*;

public class Q13
{
  public static void ReverseNum(int no)
  {
   
    
	int rev=0;
	int digit=0;
    while(no!=0)
	{
	 digit=no%10;
	 rev=rev*10+digit;
	 no=no/10;
	}
    System.out.println("reverse number ="+ rev);
  }
  public static void main (String args[])
  {
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter the number ");
   int no=sc.nextInt();
   ReverseNum(no);
  }
}