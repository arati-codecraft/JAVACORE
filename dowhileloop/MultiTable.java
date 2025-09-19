//Q9. Write a java program to print a multiplication table of any number.

import java.util.*;
public class MultiTable
{
    public static void main (String args[])
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("enter the number to create multiplication table ");
             int no=sc.nextInt();
             int i=1;
             do
               {
                   System.out.print(no*i+" ");
                    i++;
                }while(i<=10);
        }
}
