//Q10. Write a java program to count the number of digits in a number.

import java.util.*;
public class DigitCount
{
    public static void main (String args[])
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("enter the number  ");
             int no=sc.nextInt();
              int c=0;
             do
               {
                 
                   no /=10;
                   c++; 
                }while(no!=0);
               System.out.println(c);
        }
}