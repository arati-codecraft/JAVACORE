//Q7. Write a java program to find the sum of all even numbers between 1 to n.

import java.util.*;
public class SumEveNum
{
public static void main (String args[])
      {
         Scanner sc=new Scanner(System.in);
         System.out.println("sum of even number from 1 to n are");
          System.out.println("Enter the limit");
         int lim=sc.nextInt();
        
          int i=1;
          int sum=0;
         do
         {
               if(i%2==0)
               {
                 sum +=i;
               }
               i++;
            
            }while(i<=lim);
            System.out.println("Sum is ="+sum);
     
      }
}