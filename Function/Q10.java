//Q10. Write a java program to count the number of digits in a number.

import java.util.*;

public class Q10
{
  public static void CountDigit(int no)
  {
   
    int count =0;
    while(no!=0)
	{
	  no /=10;
	  ++count;
	  
	}
    System.out.println("count  digit for entered number="+ count);
  }
  public static void main (String args[])
  {
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter the number ");
   int no=sc.nextInt();
   CountDigit(no);
  }
}