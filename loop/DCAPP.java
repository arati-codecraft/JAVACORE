//Q10. Write a java program to count the number of digits in a number.

import java.util.*;
public class DCAPP
{   public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	    int no,rem;
		boolean flag=false;
		System.out.println("Enter number from keyboard");
		no=xyz.nextInt();
		int count=0;
		while(no!=0)
		{
		   no=no/10;

                   ++count;
		  }
		  
		  System.out.println("number  of digit are="+count); 
	}
}
