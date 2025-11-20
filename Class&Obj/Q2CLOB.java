/*2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/

import java.util.*;

class Calculator
{
   private int a,b;
   private Scanner sc=new Scanner(System.in);

    public void setCal()
	{
	  System.out.println("Enter the two values");
	  a=sc.nextInt();
	  b=sc.nextInt();
	  
	}	
   public void getCal()
   {
	   System.out.println("Addition is="+(a+b));
	   System.out.println("subtraction is="+(a-b));
	   System.out.println("multiplication is="+(a*b));
	   System.out.println("division is="+(a/b));
   }	
   
}

public class Q2CLOB
{
   public static void main(String args[])
   {
	Calculator c=new Calculator();
   
   c.setCal();
   c.getCal();
   }
}