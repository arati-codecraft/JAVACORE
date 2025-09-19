/*Q22. Write a java program to Check Number Is Perfect Number or Not.
Example : perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6,which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.*/

import java.util.*;
public class PerfectNumAPP
{
   public static void main(String args[])
     {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number to check wether it is perfect or not");
         int no=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=no/2)
          {
                if(no%i==0)
               {
                sum=sum+i;
                 }
                i++;
           }
           
         String msg =no==sum?"perfect number":"not perfect num";
          System.out.println(msg);
     }
}