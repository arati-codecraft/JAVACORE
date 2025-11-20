/*
17. Calculate Sum of Digits
Create a class DigitSumCalculator with a method calculateSum that computes the sum of digits of a number.
Explanation: Practices loops for digit extraction.
*/

import java.util.*;

class DigitSumCalculator
{
  private int num,sum=0;
  private Scanner sc=new Scanner(System.in);
  public void setDigit()
  {
    System.out.println("Enter the number ");
	num=sc.nextInt();
	
  }
  public void getDigit()
  {
    while(num!=0)
	{
	  int digit =num%10;
	  sum=sum+digit;
	  num/=10;
	}
	System.out.println("Sum of digit "+sum);
  }
}
public class Q17CLOB
{
   public static void main(String args[])
   {
    DigitSumCalculator ds=new DigitSumCalculator();
	ds.setDigit();
	ds.getDigit();
	
   }
}