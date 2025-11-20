//Q18. Write a java program to find the first and last digit of a number.

import java.util.*;

public class Q18
{ static int ld=0;
  static int fd=0;
  static boolean b=false;
  public static void FstLstDigi(int n)
  { 
    /*ld=n%10;
	
    if(fd>10)
	{  fd=n;
	  fd=n/10;
	 FstLstDigi(n); 
	}*/
	if(!b)
	{
		ld=n%10;
		b=true;
		FstLstDigi(n/10);
	}
	else if(n>9)
	{
		FstLstDigi(n/10);
	}
	else
	{
		fd=n;
		System.out.println("first digit="+fd);
        System.out.println("last digit="+ld);
	}
	
	

  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	FstLstDigi(num);
   }
}