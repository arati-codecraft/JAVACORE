/*Q42. Write a Java program to check whether a given number is a Kaprekar number or not, and to display all Kaprekar numbers up to n.
A Kaprekar number is a non-negative integer, the representation of whose square can be split into two parts that add up to the original number itself.
 For example:
9² = 81 → split as 8 and 1 → 8 + 1 = 9
45² = 2025 → split as 20 and 25 → 20 + 25 = 45
*/

import java.util.*;
public class KaprekerNum
{
   public static void main (String args[])
     {
         Scanner sc =new Scanner (System.in);
         System.out.println("enter the num");
         int n=sc.nextInt();
         int temp =n;
         int sum=0;
          int i=1;
          while (i<=n)
          {
             int s=n*n;
             n=s%10;
              sum +=n;
          }i++;
          System.out.println(sum);
         
      }
}
