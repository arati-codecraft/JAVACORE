//Q12. Write a java program to calculate the product of digits in a number.


import java.util.*;
public class ProdDigit
{
    public static void main (String args[])
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("enter the number  ");
             int no=sc.nextInt();
              int c=0;
              int prod=1;
             do
               {
                 
                    int digit =no %10;
                    prod *=digit;
                    no /=10;
                    
                  
                }while(no!=0);
               System.out.println(prod);
        }
}