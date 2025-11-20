import java.util.*;

public class QDuck
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner (System.in);
	 System.out.println("Enter the limit");
	 int lim=sc.nextInt();
	 System.out.println("Duck number from 1 to" + lim);
	 printDuckNum(1,lim);
   }
   public static boolean isDuckNum(int num)
   {
     boolean haszero=false;
	 int temp=num;
	 while (temp>0)
	 {
	   int digit=temp%10;
	   if(digit==0)
	   {
	     haszero=true;
	   }
	   temp /=10;
	 }
	 return haszero;
   }
   public static void printDuckNum(int current, int n)
   {
     if(current >n)
	  return;
	 if(isDuckNum(current))
	 {
	   System.out.println(current);
	 }
	 printDuckNum(current+1,n);
   }
}