//Q14. Write a java program to check whether a number is palindrome or not.

import java.util.*;
public class PalinNUMAPP
{   public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	        int no,rem;
 		System.out.println("Enter number from keyboard");
		no=xyz.nextInt();
               int onum=no;
	         int rev=0; 
		while(no!=0)//123
		{
		   rem=no%10;
                  
                   rev=rev*10+rem;
                   no=no/10;
                   
                 }
               if (onum==rev)
                       System.out.println("palindrom");
               else 
                     System.out.println("not palindrom");
            
		  
		 
	}
}
