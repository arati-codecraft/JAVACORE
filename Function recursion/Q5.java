//Q5. Write a java program to print all odd numbers between 1 to 100.

import java.util.*;

public class Q5
{
  public static void EvenNum(int n, int i)
  { 
	if(i<=n)
	{
		 if(i%2!=0)
		{
			System.out.println(i);

		}
		EvenNum(n , ++i );
	}	
   
  }
  public static void main (String args[])
  {
    Scanner sc=new Scanner (System.in);
	System.out.println("Enter the limit");
	int n=sc.nextInt();
	
	EvenNum(n , 1);
	
  }
}