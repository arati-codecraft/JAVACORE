/*
20. Calculate Sum of 1 to Nth Natural Numbers
Create a class NaturalNumberSum with a method calculateSum that computes the sum of the 1 to Nth natural numbers.
Explanation: Reinforces loops and arithmetic series formula.
*/

import java.util.*;
class NaturalNumberSum
{
  private int lim,sum;
  private Scanner sc=new Scanner (System.in);
  public void setNatSum()
  {
    System.out.println("Enter the limit to calculate the sum ");
	lim=sc.nextInt();
	
  }
  public void getNatSum()
  {
    for(int i=1;i<=lim;i++)
	{
	  sum=sum+i;
	}
	System.out.println("total sum="+sum);
  }
}
public class Q20CLOB
{
  public static void main(String args[])
  {
   NaturalNumberSum ns=new NaturalNumberSum();
   ns.setNatSum();
   ns.getNatSum();
  }
}