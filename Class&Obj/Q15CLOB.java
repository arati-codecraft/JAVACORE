/*
15. Swap Two Numbers
Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
Explanation: Covers mathematical operations for swapping.
*/

import java.util.*;

class Swapper
{ private int n1,n2;
  private Scanner sc=new Scanner(System.in);
  public void setSwapper()
  {
    System.out.println("Enter the two values ");
	n1=sc.nextInt();
	n2=sc.nextInt();
  }
  public void getSwapper()
  {
    int temp=0;
	temp=n1;
	n1=n2;
	n2=temp;
	System.out.println("values after swapping"+n1+" "+n2 );
  }
}
public class Q15CLOB
{
  public static void main(String args[])
  {
    Swapper s=new Swapper();
	s.setSwapper();
	s.getSwapper();
  }
}