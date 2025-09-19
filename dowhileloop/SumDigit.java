//Q11. Write a java program to calculate the sum of digits in a number.

import java.util.*;
public class SumDigit
{
    public static void main (String args[])
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("enter the number  ");
             int no=sc.nextInt();
              int c=0;
              int sum=0;
             do
               {
                 
                    int digit =no %10;
                    sum +=digit;
                    no /=10;
                    
                  
                }while(no!=0);
               System.out.println(sum);
        }
}