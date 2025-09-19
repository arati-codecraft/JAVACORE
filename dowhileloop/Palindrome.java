//Q14. Write a java program to check whether a number is palindrome or not.

import java.util.*;
public class Palindrome
{
    public static void main (String args[])
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("enter the number  ");
             int no=sc.nextInt();
              int temp=no;
              int c=0;
              int prod=1;
               int rev=0;
             do
               {
                    int digit=no%10;
                    rev=rev*10+digit;
                     no/=10;
                    
                    
                  
                }while(no!=0);
               if ( rev==temp)
               System.out.println("palindrome");
               else 
               System.out.println("not palindrome");
        }
}