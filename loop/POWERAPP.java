//Q16. Write a java program to find power of a number.

import java.util.*;
public class POWERAPP
{
       public static void main (String args[])
             {
                Scanner sc=new Scanner (System.in);
                System.out.println("enter the base number");
                int num=sc.nextInt();
                 System.out.println("enter the index number");
                int index=sc.nextInt();
                int p=1;
                int i=1;
                while(i<=index)
                    {
                        p=p*num;
                        i++;
                     }
                 System.out.println(p);
              }
}