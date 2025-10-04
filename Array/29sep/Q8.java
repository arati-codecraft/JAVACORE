/*
Q8. Write a java program to display top three value from array.

	Sample Input: [78, 90, 90, 86, 85, 92, 70, 92]
	Expected Output: 92, 90, 86
*/

import java.util.*;
public class Q8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter "+n+" elements: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
			for(int i = 0; i < arr.length-1; i++){
				for(int j = i + 1; j <  arr.length; j++){
					if(arr[i] > arr[j]){
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			System.out.println("Top three distinct values: ");
			for(i=1; i<a.length;i++)
		{   int count=0;
                    for (int j=0;j<n;j++)
                       {

			 if(a[i]==a[j])
			 {
                             count++;
			 }
                       }
                     if(count==1)  
                    {
		  System.out.print(a[i]+"  ");
                     }
		   }

			}	
	}
}