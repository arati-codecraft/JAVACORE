 /*
Question 1:
Given a sorted array (may contain duplicates), find the first and last index of a given number x using binary search.
Example:
 arr = [2, 4, 4, 4, 6, 7, 9], x = 4
 Output: First = 1, Last = 3
Explanation:
Modify binary search:


To find first occurrence, if arr[mid] == x, move left to check more occurrences.
To find last occurrence, if arr[mid] == x, move right to check more occurrences.


This requires two binary searches.
*/

import java.util.Scanner;

public class Q1
 {
    public static void main(String args[]) 
      {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s = xyz.nextInt();
        int a[] = new int[s];

        System.out.println("Enter values in array");
        for (int i = 0; i < a.length; i++) 
           {
                a[i] = xyz.nextInt();
           }

        System.out.println("Enter search key");
        int x = xyz.nextInt();

       
        int l = 0, r = a.length - 1;
        int firstIndex = -1;
        while (l <= r) 
           {
            int mid = l + (r - l) / 2;
            if (a[mid] == x)
               {
                  firstIndex = mid;
                  r = mid - 1; 
                }
               else if (a[mid] < x) 
               {
                   l = mid + 1;
               }
               else
               {
                    r = mid - 1;
                } 
        }

        if (firstIndex == -1)
          {
               System.out.println("Element not found");
           } 
       else
          {
            
              l = 0;
              r = a.length - 1;
              int lastIndex = -1;
              while (l <= r)
               {
                  int mid = l + (r - l) / 2;
                  if (a[mid] == x)
                    {
                      lastIndex = mid;
                       l = mid + 1; 
                     }
                    else if (a[mid] < x) 
                    {
                        l = mid + 1;
                     }
                   else 
                   {
                      r = mid - 1;
                    }
            }

            System.out.println("First index = " + firstIndex);
            System.out.println("Last index = " + lastIndex);
        }
    }
}
