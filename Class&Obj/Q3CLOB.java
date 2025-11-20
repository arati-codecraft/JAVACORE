/*
3. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.
*/

import java.util.*;

class NumberComparison
{ private int a,b;
  private Scanner sc=new Scanner(System.in);
  public void setNum()
  {
    System.out.println("Enter the two values to check two numbers are equal, greater, or less");
	a=sc.nextInt();
	b=sc.nextInt();
  }
  
  public void getMax()
  {
    String result=(a>b)?"a is grater":(a<b)?"b is greter":"both are equal";
	System.out.println(result);
  }
}

public class Q3CLOB
{
  public static void main(String args[])
  {
    NumberComparison nc=new NumberComparison();
	nc.setNum();
	nc.getMax();
  }
}