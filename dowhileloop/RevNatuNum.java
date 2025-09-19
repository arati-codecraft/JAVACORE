//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.

import java.util.*;
public class RevNatuNum
{
public static void main (String args[])
      {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the limit");
         
         int lim=sc.nextInt();
          int i=lim;
         do
         {
           System.out.println(i);
           i--;
         }while(i!=0);
      }
}