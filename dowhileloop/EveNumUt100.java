//Q4. Write a java program to print all even numbers between 1 to 100.- using while loop

import java.util.*;
public class EveNumUt100
{
public static void main (String args[])
      {
         Scanner sc=new Scanner(System.in);
         System.out.println("even number from 1 to 100 are");
         
        
          int i=1;
         do
         {
           if(i%2==0)
           {
           System.out.print(i+"  ");
            }
           i++;
         }while(100>=i);
      }
}