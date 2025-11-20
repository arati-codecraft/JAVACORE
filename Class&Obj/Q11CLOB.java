/*
11. Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.
*/


import java.util.*;

class NumberReverser
{
  private int num;
  private int rev=0;
  private Scanner sc=new Scanner(System.in);
  
  public void setNum()
  {
     System.out.println("Enter the number ");
	 num=sc.nextInt();
	 
  }
  public void getRev()
  {
	while(num!=0)
	{
    rev=rev*10+num%10;
	num/=10;
	}
	System.out.println("number after reverse"+rev);
  }
}
public class Q11CLOB
{
  public static void main (String args[])
  {
    NumberReverser nr=new NumberReverser();
	nr.setNum();
	nr.getRev();
  }
}