//Q14. Write a java program to check whether a number is palindrome or not.

import java.util.*;

public class Q14
{ static int temp=0;
  
  public static void RevNum(int n,int rev)
  { 
    if(n>0)
	{
	  rev=rev*10+n%10;
	  n /=10;
	  RevNum(n,rev);
	  
	}
	else
	{  if (temp==rev)
		System.out.println("number is palindrom");
	   else
		   System.out.println("number is not palindrom");
	}
  }
  public static void main (String args[])
  {
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter the number");
   int num=sc.nextInt();
   temp=num;
   RevNum(num,0);
  }
}



