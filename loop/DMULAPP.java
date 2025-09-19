//Q12. Write a java program to calculate the product of digits in a number.
import java.util.*;
public class DMULAPP
{   public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	    int no,rem;
		boolean flag=false;
		System.out.println("Enter number from keyboard");
		no=xyz.nextInt();
		rem=0;
	        int product =1;
		while(no!=0)//123
		{
		   rem=no%10;
                    product=rem*product;
                    no=no/10;
                   
                }
		  System.out.println("product of digits="+product); 
	}
}
