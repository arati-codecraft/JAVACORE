//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.

import java.util.*;
public class RNANUMAPP
{   public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	        int no;
 		System.out.println("Enter number from keyboard");
		no=xyz.nextInt();
	
		while(no>=1)
		{
		  System.out.println(no);
                   no--;
                    }
		  
		 
	}
}
