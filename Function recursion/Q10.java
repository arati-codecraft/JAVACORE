//Q10. Write a java program to count the number of digits in a number.

import java.util.*;

public class Q10
{ 
 public static void CountDigi(int n,int c)
 {
   if(n!=0)
   {
     n=n/10;
	 ++c;
	 CountDigi(n,c);
   }
   else 
   {
   System.out.println(c);
   }
 }
 public static void main (String args[])
 {
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter the number");
   int num=sc.nextInt();
   CountDigi(num,0);
 }
}