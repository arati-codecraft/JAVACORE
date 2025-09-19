//Q6. Write a java program to find the sum of all natural numbers between 1 to n.


import java.util.*;
public class SumNatuNum
{
public static void main (String args[])
      {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the limit");
         
         int lim=sc.nextInt();
          int i=1;
          int sum=0;
         do
         {
            sum+=i;
           System.out.println(sum);
            i++;
         }while(lim>=i);
       System.out.println("total sum="+sum);
      }
}