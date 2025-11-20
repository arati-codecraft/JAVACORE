//Q14. Write a java program to check whether a number is palindrome or not.

import java.util.*;

public class Q14
{
  public static void PalindromNum(int no)
  {
   
    int temp=no;
	int rev=0;
	int digit=0;
    while(no!=0)
	{
	 digit=no%10;
	 rev=rev*10+digit;
	 no=no/10;
	 
	}
	if(rev==temp)
     System.out.println("number is palindrom");
	else 
	System.out.println("number is not palindrom");
  }
  public static void main (String args[])
  {
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter the number ");
   int no=sc.nextInt();
   PalindromNum(no);
  }
}