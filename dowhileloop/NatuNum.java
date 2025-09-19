//Q1. Write a java program to print all natural numbers from 1 to n. using while loop

import java.util.*;
public class NatuNum
{
public static void main (String args[])
      {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the limit");
         
         int lim=sc.nextInt();
          int i=1;
         do
         {
           System.out.println(i);
           i++;
         }while(lim>=i);
      }
}