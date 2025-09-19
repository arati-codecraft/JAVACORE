//Q19. Write a java program to find the sum of the first and last digit of a number.

import java.util.*;
public class FiLasumAPP
{
       public static void main (String args[])
         {
                Scanner sc=new Scanner(System.in);
                 System.out.println("enter the num");
                int n= sc.nextInt();
                int last= n%10;
                 int sum=0;
               int firstnum=n;
                while (firstnum>=10)
                 {
                      firstnum/=10;
                       sum=last+firstnum;
                  }
                System.out.println("last digit"+last);
                 System.out.println("first digit"+firstnum);
                 System.out.println("sum"+sum);


           }
}