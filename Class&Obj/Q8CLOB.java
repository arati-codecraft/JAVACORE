/*
8. Find Square of a Number
Create a class SquareFinder with a method square that calculates the square of a number.
Explanation: Covers single-parameter logic in methods.
*/

import java.util.*;
class SquareFinder
{
  private int num;
  private Scanner sc=new Scanner(System.in);
  public void setSquare()
  {
    System.out.println("Enter the number ");
	num=sc.nextInt();
	
  }
  public void getSquare()
  {
   System.out.println("Square of the given number is="+num*num);
   
  }
}
public class Q8CLOB 
{
  public static void main (String args[])
  {
    SquareFinder sf=new SquareFinder();
	sf.setSquare();
	sf.getSquare();
	
  }
}