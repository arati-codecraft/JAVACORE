//Q17. Write a java program to find all factors of a number.
import java.util.*;
public class Q17
{
    public static int getFact(int n)
	{    if(n<=1)
		{ return n;
		}
		else{
		  return n*getFact(n-1);
		}
	}
    public static void main(String x[])
	{   Scanner sc=new Scanner (System.in);
	    System.out.println("Enter the number to find out factorial");
	    int num=sc.nextInt();
	    int result = getFact(num);  
		System.out.println("Result is "+result);
	}
}
