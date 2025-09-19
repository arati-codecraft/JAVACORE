//Q7. Write a java program to find the sum of all even numbers between 1 to n.

import java.util.*;
public class EvenSUMAPP
{   public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	        int no;
 		System.out.println("Enter number from keyboard");
		no=xyz.nextInt();
		int i=1;
                int sum =0;
		while(i<=no)
		{
                    if (i%2==0)
                      {
		      System.out.println(i); 
                        sum=i+sum;
                      }
                         i++;
                     }		  
		
                 System.out.println(sum);
               
	}
}
