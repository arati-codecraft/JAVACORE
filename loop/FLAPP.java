//Q18. Write a java program to find the first and last digit of a number.
import java.util.*;
public class FLAPP
{
       public static void main (String args[])
         {
                Scanner sc=new Scanner(System.in);
                 System.out.println("enter the num");
                int n= sc.nextInt();
                int last= n%10;
               int firstnum=n;
                while (n>0)
                 {
                      firstnum=n/10;
                  }
                System.out.println(last);
                 System.out.println(firstnum);

           }
}