/*
Q1. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of the array.
*/
import java.util.*;
public class Q1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter "+n+" elements: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		int idx = 0;
		for(int i = 0; i < arr.length;i++){
			if(arr[i] != 0){
				arr[idx++] = arr[i]; 
			}
		}
		while(idx < arr.length){
			arr[idx++] = 0;
		}
		System.out.println("The new array is: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
