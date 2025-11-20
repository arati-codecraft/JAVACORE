/*
19. Find GCD of Two Numbers
Create a class GCDCalculator with a method findGCD to compute the greatest common divisor of two numbers.
Explanation: Introduces loops and mathematical relationships.
*/

import java.util.*;
class GCDCalculator
{
  private int n1,n2;
  private Scanner sc=new Scanner(System.in);
  public void setGCD()
  {
   System.out.println("Enter the two number ");
   n1=sc.nextInt();
   n2=sc.nextInt();
   
  }
  public void getGCD()
  {
    int a=n1;
	int b=n2;
	while (b!=0)
             {
                 int temp=b;
                 b=a%b;
                 a=temp;
              }
            System.out.println("gcd of both number is "+a);
  }
}
public class Q19CLOB
{
  public static void main(String args[])
  {
   GCDCalculator gc=new GCDCalculator();
   gc.setGCD();
   gc.getGCD();
   
  }
}
