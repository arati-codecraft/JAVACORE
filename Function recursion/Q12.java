//Q12. Write a java program to calculate the product of digits in a number.

import java.util.*;

public class Q12
{ 
 public static void ProDigi(int n, int p)
 {
   if(n>0)
   {
	 p=p*(n%10);
	 n=n/10;
	 ProDigi(n,p);
	 
   }
   else 
   {
   System.out.println("product of all digits "+p);
   }
 }
 public static void main (String args[])
 {
   Scanner sc=new Scanner (System.in);
   System.out.println("Enter the number");
   int num=sc.nextInt();
   ProDigi(num,1);
 }
}