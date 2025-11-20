//Q16. Write a java program to find power of a number.

import java.util.*;
public class Q16
{   static int p=1;
    public static int getPower(int base,int index)
	{
	 
	   if(index!=0)
	   {  p =p  * base;
	     index=index-1;
		  return getPower(base,index);
	   }
	   return p;
	}
    public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	   int base,index;
	   System.out.println("Enter base and index");
	   base=xyz.nextInt();
	   index=xyz.nextInt();
	   int result= getPower(base,index);
	   System.out.println("Power is  "+result);
	}
}
