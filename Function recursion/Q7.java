//Q7. Write a java program to find the sum of all even numbers between 1 to n.

import java.util.*;

public class Q7
{ static int sum=0;
  public static void EvenNum(int n, int i)
  { 
	if(i<=n)
	{
		 if(i%2==0)
		{
			
		  sum=sum+i;
               
		}
		
		EvenNum(n , ++i );
	}	
	else
	{
		System.out.println(sum);
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