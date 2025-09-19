//Q18. Write a java program to find the first and last digit of a number.
import java.util.*;
public class FiLaAPP
{
       public static void main (String args[])
         {
                Scanner sc=new Scanner(System.in);
                 System.out.println("enter the num");
                int n= sc.nextInt();
                int last= n%10;
               int firstnum=n;
                while (firstnum>=10)
                 {
                      firstnum/=10;
                  }
                System.out.println("last digit"+last);
                 System.out.println("first digit"+firstnum);

           }
}