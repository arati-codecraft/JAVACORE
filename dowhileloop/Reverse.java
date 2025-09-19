//Q13. Write a java program to enter a number and print its reverse.

import java.util.*;
public class Reverse
{
    public static void main (String args[])
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("enter the number  ");
             int no=sc.nextInt();
              int c=0;
              int prod=1;
               int rev=0;
             do
               {
                    int digit=no%10;
                    rev=rev*10+digit;
                     no/=10;
                   
                    
                  
                }while(no!=0);
               System.out.println(rev);
        }
}