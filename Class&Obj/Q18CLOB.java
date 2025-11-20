/*
18. Check Leap Year
Create a class LeapYearChecker with a method isLeapYear to check if a year is a leap year.
Explanation: Implements logical conditions for leap year calculation.
*/

import java.util.*;
class LeapYearChecker
{
  private int year;
  private Scanner sc=new Scanner (System.in);
  public void setLeap()
  {
    System.out.println("Enter the leap year");
	year =sc.nextInt();
	
  }
  
  public void getLeap()
  {
    if(year%4==0||(year %100==0&&year%400==0))
	{
	 System.out.println("year is leap year");
	 
	}
	else
	{
	  System.out.println("year is not leap");
	}
  }
}
public class Q18CLOB
{
  public static void main(String args[])
  {
   LeapYearChecker lc=new LeapYearChecker();
   lc.setLeap();
   lc.getLeap();
  }
}