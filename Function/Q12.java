//Q12. Write a java program to calculate the product of digits in a number.

import java.util.*;

public class Q12
{
  public static void DigitProduct(int no)
  {
   
    
	int pro =1;
	int digit=0;
    while(no!=0)
	{
	  digit=no%10;
	  pro=pro*digit;
	  no /=10;
	}
    System.out.println("product of all digit="+ pro);
  }
  public static void main (String args[])
  {
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter the number ");
   int no=sc.nextInt();
   DigitProduct(no);
  }
}