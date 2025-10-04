/*
Q10. Given an array of integers nums and an integer target, return indices of the two numbers 
such that they add up to target. 
You may assume that each input would have exactly one solution, and you may not use the 
same element twice. 
You can return the answer in any order. 
Example 1: 
Input: nums = [2,7,11,15], target = 9   
Output: [0,1] 
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. 
Example 2: 
Input: nums = [3,2,4], target = 6   
Output: [1,2]

*/

import java.util.*;
public class Q10
{
   public static void main (String args[])
     {
         Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int a[] = new int[n];
		int tar=0;
		System.out.println("Enter "+n+" elements: ");
		for(int i = 0; i < a.length; i++)
                  {    
			a[i] = sc.nextInt();
		    }
                  
                System.out.println("Enter the sum");
                int sum=sc.nextInt();
                 for (int i=0;i<n;i++)
                   {    
                      for (int j=i+1;j<n;j++)
                           {
                              if(sum==a[i]+a[j])
                                {
                                   System.out.print("[" + i + ","+ j + " ]");
                                 }
                           }System.out.println();
                    }

        

      }
}









