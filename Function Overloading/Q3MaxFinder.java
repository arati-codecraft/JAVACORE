/*
Q3. Write a program with a class MaxFinder having overloaded max() methods that return the largest value among:
two integers,
three integers, and
two double values.
*/

import java.util.*;
public class Q3MaxFinder
{
  public static void main (String args[])
  {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter first integer: ");
        int v1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int v2 = sc.nextInt();
        System.out.print("Enter third integer: ");
        int v3 = sc.nextInt();

        
        System.out.print("Enter first double: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter second double: ");
        double d2 = sc.nextDouble();
		
		System.out.println("maxNum of two integers: " + max(v1, v2));
        System.out.println("maxNum of three integers: " + max(v1, v2, v3));
        System.out.println("maxNum of two doubles: " + max(d1, d2));
	
  }
  public static  int max(int a, int b)
  {
    if(a>b)
	 return a;
	else 
	  return b;
  }
  public static int max(int a,int b,int c)
  {
     if (a>b && a>c)
	    return a;
	 else if (b>c)
		return b;
	 else 
		return c;
 }
 public static  double max(double e, double d)
  {
    if(e>d)
	 return e;
	else 
	  return d;
  }
}