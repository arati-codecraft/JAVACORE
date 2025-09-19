//Q9. Write a java program to print a multiplication table of any number.

import java.util.*;
public class TABLEAPP
{
   public static void main (String args[])
     {
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number for multiplication table");
       int num=sc.nextInt();
       int i=1;
        while(i<=10)
          {
             System.out.println(num*i);
               i++;
           }
       }
}