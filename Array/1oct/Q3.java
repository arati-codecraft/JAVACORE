/*
Question 3:
Given an integer n, find its floor square root using binary search.
Example:
 n = 17
 Output: 4 (since 4² = 16 ≤ 17 < 25)
Explanation:
Apply binary search between 1 and n.
If mid * mid == n, answer found.
If mid * mid < n, move right, but store mid as possible answer.
If mid * mid > n, move left.
*/
import java.util.*;
public class Q3
{
     public static void main(String args[])
       {
             Scanner sc=new Scanner (System.in);
              System.out.println("Enter the number");
               int n=sc.nextInt();
             if (n == 0 || n == 1)
                  System.out.println(n);

                int low = 1, high = n, ans = 0;
                
            while (low <= high) 
                 {
                     int mid = (low + high) / 2;

                     if (mid <= n / mid) 
                      {
                         ans = mid;
                        low  = mid + 1;
                       }
                     else  
                      {
                        high = mid - 1;
                     }
               
                 }
            System.out.println("Floor square root of " + n + " is: " + ans);

          }
}



