/*
12. Find Factorial of a Number
Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
Explanation: Focuses on iterative or recursive logic.
*/

import java.util.*;

class FactorialCalculator
{
 private int num, i=1;
 private int fact=1;
 private Scanner sc=new Scanner(System.in);
 
 public void setFact()
 {
   System.out.println("Enter the number ");
   num=sc.nextInt();
  
 }
 public void  getFact()
 {
   
   while(num!=0)
     {
        fact *=num;
        
        --num;
     }
	 System.out.println(fact);
 }
 
}
public class Q12CLOB
{
  public static void main (String args[])
  {
     FactorialCalculator fn=new FactorialCalculator();
	 fn.setFact();
	 fn.getFact();
  }
}