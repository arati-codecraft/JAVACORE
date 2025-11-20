/*
Q4. Write a Java class VolumeCalculator with overloaded methods named volume() to calculate:
volume of a cube (using side),
volume of a cuboid (using length, breadth, height),
volume of a cylinder (using radius, height).
Hint: Apply formulas :
Cube → side³
Cuboid → l×b×h
Cylinder → 3.14×r×r×h
*/

import java.util.*;
public class Q4VolumeCalculator
{
  public static void main (String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the side of cube");
	int s1=sc.nextInt();
	System.out.println("Enter the length,breadth,heigth of cuboid");
	int l1=sc.nextInt();
	int b1=sc.nextInt();
	int h1=sc.nextInt();
    System.out.println("enter the radius and heigth of cylinder");
	double r1=sc.nextDouble();
	double h2=sc.nextDouble();
	
	System.out.println("volume of cube="+ volume(s1,s1,s1));
	System.out.println("volume of cuboid="+ volume(l1,h1,b1));
	System.out.println("volume of cylinder="+ volume(r1,h2));
  }
  public static int volume(int s)
  {
    return s*s*s;
  }
  public static int volume(int l,int b,int h)
  {
    return l*b*h;
  }
  public static double volume(double r,double h1)
  {
    return 3.14*r*r*h1;
  }
}