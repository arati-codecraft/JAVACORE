//Q11. Write a java program to calculate the sum of digits in a number.

import java.util.*;

public class Q11
{ 
 public static void SumDigi(int n,int s)
 {
   if(n>0)
   {
     
	 s=s+n%10;
	 n=n/10;
	 SumDigi(n,s);
   }
   else 
   {
   System.out.println("Sum of all digits "+s);
   }
 }
 public static void main (String args[])
 {
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter the number");
   int num=sc.nextInt();
   SumDigi(num,0);
 }
}