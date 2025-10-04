/*
Q2. Write a program in java to find a subarray with given sum from the given array?
		Expected Output :
		The given array is : 3 4 -7 1 3 3 1 -4
		Sum =  7 ;
		[0..1] -- { 3 4 }
		[0..5] -- { 3 4 -7 1 3 3 }
		[3..5] -- { 1 3 3 }
		[4..6] -- { 3 3 1 }
*/

import java.util.*;
public class Q2
{
	public static void main(String[] args)
           {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter "+n+" elements: ");
		for(int i = 0; i < arr.length; i++)
                  {
			arr[i] = sc.nextInt();
		    }
		System.out.print("Enter Target sum: ");
		int target = sc.nextInt();
		
		System.out.println("Sum = "+target);
		for(int i = 0; i < arr.length; i++)
                    {
			int sum = 0;
			for(int j = i; j < arr.length; j++)
                        {
				sum = sum + arr[j];
				if(sum == target)
                                   {
					System.out.print("[" +i+".."+j+" ] -- { ");
					for(int k = i; k <= j; k++)
                                          {
						System.out.print(arr[k]+" ");
					  
					}
					 System.out.print("}");
                                         System.out.println();
				}
			}
		}
	}
}