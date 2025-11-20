/*
14. Check for Prime Numbers
Create a class PrimeChecker with a method isPrime to check if a number is prime.
Explanation: Introduces number theory logic.
*/

import java.util.*;

class PrimeChecker
{
  private int num;
  private Scanner sc=new Scanner (System.in);
  
  public void setPrime()
  {
    System.out.println("Enter the number");
	num=sc.nextInt();
  }
  public void getPrime()
  {  if (num <= 1) 
        {
            System.out.println(num + " is not prime");
            return;
        }

        for (int i = 2; i < num; i++) 
		{
            if (num % i == 0) 
			{
                System.out.println(num + " is not prime");
                return;
            }
        }
        System.out.println(num + " is prime");
    }
 
  
}
public class Q14CLOB
{
  public static void main(String args[])
  {
    PrimeChecker pc=new PrimeChecker();
    pc.setPrime();
	pc.getPrime();
  }
}