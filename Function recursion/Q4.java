//Q4. Write a java program to print all even numbers between 1 to 100.- using while loop

import java.util.*;

public class Q4
{
  public static void EvenNum(int n, int i)
  { 
	if(i<=n)
	{
		 if(i%2==0)
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