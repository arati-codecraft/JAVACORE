/*
13. Find Power of a Number
Create a class PowerCalculator with a method power that calculates base raised to an exponent.
Explanation: Demonstrates looping or recursion.
*/

import java.util.*;

class PowerCalculator
{
   private int base,power;
   private Scanner sc=new Scanner (System.in);
   
   public void setNum()
   {
     System.out.println("enter the base number");
	 base=sc.nextInt();
	 
	 System.out.println("Enter the power of number");
	 power=sc.nextInt();
   }
   public void getPower()
   {
     int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * base;
        }
        System.out.println(base + " raised to the power " + power + " is: " + result);
   }
}
public class Q13CLOB
{
  public static void main(String args[])
  {
    PowerCalculator pc=new PowerCalculator();
	pc.setNum();
	pc.getPower();
  }
}