//Q4. Write a java program to print all even numbers between 1 to 100.- using while loop

import java.util.*;
public class Q4
{
  public static void EvenNum(int lim)
  {
	System.out.println("liist of all even num upto " + lim);
   for(int i=1;i<=lim;i++)
   { 
     if (i%2==0)
	 {
	  System.out.println(i);
	 }
   }
  }
  public static void main (String args[])
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit to print even number");
	int lim=sc.nextInt();
	EvenNum(lim);
  }
}