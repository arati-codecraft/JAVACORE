/*
Q2. Create a class Adder that contains overloaded methods named sum() to calculate:
sum of two integers,
sum of three integers, and
sum of two double values.
*/

import java.util.*;
class Q2Adder
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

        
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

        
        System.out.println("Sum of two integers: " + sum(v1, v2));
        System.out.println("Sum of three integers: " + sum(v1, v2, v3));
        System.out.println("Sum of two doubles: " + sum(d1, d2));
    }

  public static int sum(int a,int b)
  {
    return a+b;
  }
  public static int sum(int a,int b,int c)
  {
    return a+b+c;
  }
  public static double sum(double d,double e)
  {
    return d+e;
  }
  
}