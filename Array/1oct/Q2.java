/*
Question 2:
Given a sorted array rotated at some pivot (like [6, 7, 1, 2, 3, 4, 5]), search for a number x using binary search.
Example:
 arr = [6, 7, 1, 2, 3, 4, 5], x = 3
 Output: Found at index 4
Explanation:
In rotated arrays, one half (left or right) is always sorted.
Check which half is sorted:


If arr[left] <= arr[mid], left part is sorted.
Else, right part is sorted.


Decide which half to discard based on x.
*/

import java.util.*;

public class  Q2 
{
    public static void main(String[] args) 
     {
          Scanner sc=new Scanner (System.in);
          System.out.println("Enter the size of array");
          int s=sc.nextInt();
        int arr[] =new int[s]; 
         System.out.println("Enter the values of an array");
         for (int i=0;i<s;i++)
           {
               arr[i]=sc.nextInt();
            }
 
        int left = 0, right = arr.length - 1;
        int index = -1;
        System.out.println("Enter the search key");
        int x=sc.nextInt();
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                index = mid;
                break;
            }
           
            if (arr[left] <= arr[mid]) {
                if (x >= arr[left] && x < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
           
            else {
                if (x > arr[mid] && x <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        System.out.println(index != -1 ? "Found at index " + index : "Not found");
    }
}