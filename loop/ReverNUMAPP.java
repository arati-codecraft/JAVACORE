//Q13. Write a java program to enter a number and print its reverse.

import java.util.*;
public class ReverNUMAPP
{   public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	        int no,rem;
 		System.out.println("Enter number from keyboard");
		no=xyz.nextInt();
	         int rev=0; 
		while(no!=0)//123
		{
		   rem=no%10;
                  
                   rev=rev*10+rem;
                   no=no/10;
                    
                 }
		
                System.out.println(rev);
		  
		 
	}
}
