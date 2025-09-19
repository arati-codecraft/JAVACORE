/*Q21.  Write a java program to check Number Is Prime Number or Not.
Example : A prime number is a number that can only be divided by itself and 1 without remainders.The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.8*/

import java.util.*;
public class PrimeNumApp
{
  public static void main(String[] args) {
       
        Scanner sc=new Scanner (System.in);
         System.out.println("enter the number");
         int n=sc.nextInt();
         int i=2;
         
         boolean flag = false;	
         while(i<=n/2)
         {
             if(n%i==0)
             {
             flag=true;
             break;
             }
             ++i;
         }
         if (!flag)
                
		      System.out.println(n + " is a prime number.");
		    else
		      System.out.println(n + " is not a prime number.");
		sc.close();
         
        
              }
      
}
