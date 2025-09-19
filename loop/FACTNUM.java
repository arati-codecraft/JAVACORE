//Q17. Write a java program to find all factors of a number.
import java.util.*;
public class FACTNUM
{
         public static void main (String args[])
             {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("enter the num");
                 int num=sc.nextInt();
                 int fact=1;
                 int i=1;
                while(i<=num)
                  {
                      fact *=i;
                      System.out.println(fact);
                      i++;
                  }
              }

}