//Q5. Write a java program to print all odd numbers between 1 to 100.

import java.util.*;
public class ODDNumAPP
{   public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	        int no;
 		System.out.println("Enter number from keyboard");
		no=xyz.nextInt();
		int i=1;
		while(i<=no)
		{
                    if (i%2!=0)
                      {
		   System.out.println(i); 
                      }
                    i++;
		  }
		  
		 
	}
}
