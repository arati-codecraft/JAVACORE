/*
5. Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time.
Explanation: Demonstrates mathematical formula implementation.
*/

import java.util.*;

class CalSI
{
   private int p,r,t;
   private int si;
   private Scanner sc=new Scanner(System.in);
   public void setSI()
   {
    System.out.println("enter the principle");
	p=sc.nextInt();
	System.out.println("Enter the rate");
	r=sc.nextInt();
	System.out.println("Enter the time");
	t=sc.nextInt();
   }
   public void getSI()
   {
    System.out.println("Simple interest is=");
	si=(p*r*t)/100;
	System.out.println(si);
   }
}
public class Q5CLOB
{
  public static void main (String args[])
  {
     CalSI cs=new CalSI();
    cs.setSI();	
    cs.getSI();	
  }
}