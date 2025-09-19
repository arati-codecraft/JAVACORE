//Q5. Write a java program to print all odd numbers between 1 to 100.

import java.util.*;
public class OddNumUt100
{
public static void main (String args[])
      {
         Scanner sc=new Scanner(System.in);
         System.out.println("even number from 1 to 100 are");
         
        
          int i=1;
         do
         {
           if(i%2!=0)
           {
           System.out.print(i+"  ");
            }
           i++;
         }while(100>=i);
      }
}