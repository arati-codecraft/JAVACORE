/*
10. Find the Area of a Circle
Create a class CircleArea with a method findArea that calculates the area given the radius.
*/

import java.util.*;

class CircleArea
{
  private int radius;
  private double r;
  private Scanner sc=new Scanner (System.in);
  public void setArea()
  {
    System.out.println("Enter the radius of circle");
	radius=sc.nextInt();
	
  }
  public void getArea()
  {
    r=3.14*(radius*radius);
	System.out.println("Area of circle is="+r);
  }
}

public class Q10CLOB
{
  public static void main(String args[])
  {
   CircleArea ca=new CircleArea();
   ca.setArea();
   ca.getArea();
  }
}