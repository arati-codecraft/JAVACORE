/*Q5. Write a Java program with class DistanceCalculator that contains overloaded distance() methods to calculate:
distance = speed × time (integer type),
distance = initial velocity × time + 0.5 × acceleration × time² (double type).
*/

import java.util.*;
public class Q5DistanceCalculator
{
  public static void main (String args[])
  {
    Scanner sc=new Scanner (System.in);
	System.out.println("Enter the speed ");
	int d=sc.nextInt();
	System.out.println("Enter the  time");
	int t=sc.nextInt();
	
	System.out.println("enter the velocity,time,acceleration");
	double v=sc.nextDouble();
	double t1=sc.nextDouble();
	double a=sc.nextDouble();
	
	System.out.println("distance=" + distance(d,t));
	System.out.println("distance=" + distance(v,t1,a));
  }
  public static int distance(int s,int t)
  {
    return s*t;
  }
  public static double distance(double v,double t,double a)
  {
    return (v*t)+0.5*a*(t*t);
  }
}