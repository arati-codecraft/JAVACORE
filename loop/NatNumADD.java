//Q6. Write a java program to find the sum of all natural numbers between 1 to n.

import java.util.*;
public class NatNumADD
{   public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	        int no;
 		System.out.println("Enter number from keyboard");
		no=xyz.nextInt();
		int i=1;
                int sum=0;
		while(i<=no)
		{
                   
                  
                    sum=i+sum;
                     i++;
                   
		 }
              System.out.println(sum);
		 
	}
}
