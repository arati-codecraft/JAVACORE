//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using function
import java.util.*;

public class Q2
{
  public static void RevNatNum(int lim)
  {
    for (int i=lim;i>=1;i--)
	{
	  System.out.println(i);
	}
	
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit");
	int lim=sc.nextInt();
	
	RevNatNum(lim);
	
  }
}