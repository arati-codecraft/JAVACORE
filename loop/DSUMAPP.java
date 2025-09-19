//Q11. Write a java program to calculate the sum of digits in a number.
import java.util.*;
public class DSUMAPP
{   public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	    int no,rem;
		boolean flag=false;
		System.out.println("Enter number from keyboard");
		no=xyz.nextInt();
		rem=0;
	        int sum =0;
		while(no!=0)//123
		{
		   rem=no%10;
                    sum=rem+sum;
                    no=no/10;
                   
                }
		  System.out.println("sum of digits="+sum); 
	}
}
