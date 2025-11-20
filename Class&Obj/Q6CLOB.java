/*
6. Find the Maximum of Three Numbers
Create a class MaxFinder with a method findMax that returns the largest of three numbers.
Explanation: Enhances problem-solving using conditional statements.
*/

import java.util.*;

class MaxNum
{ private int a,b,c;
  private Scanner sc=new Scanner(System.in);
  public void setNum()
  {
    System.out.println("Enter the three values to check  numbers are equal, greater, or less");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
  }
  
  public void getMax()
  {
    String result=(a>b&&a>c)?"a is grater":(b>c&&b>a)?"b is greter":"c is greater";
	System.out.println(result);
  }
}

public class Q6CLOB
{
  public static void main(String args[])
  {
    MaxNum mn=new MaxNum();
	mn.setNum();
	mn.getMax();
  }
}