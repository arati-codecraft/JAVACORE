/*4. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.
*/

import java.util.*;

class NumberChecker
{
  private int n;
  private Scanner sc=new Scanner(System.in);
  public void setNum()
  {
    System.out.println("Enter the number to check it is even or not");
	n=sc.nextInt();
  }
  public void getIsEven()
  {
    String result=(n%2==0)?"number is even":"number is odd";
	System.out.println(result);
  }
}


public class Q4CLOB
{
  public static void main (String args[])
  {
    NumberChecker nc=new NumberChecker();
	nc.setNum();
	nc.getIsEven();
  }
}