/*
Q4.Write a Java program to check if two arrays are equal (same elements in same order) using a function.
Example Input:
a = {1, 2, 3, 4}
b = {1, 2, 3, 4}
Output:
Arrays are equal.
*/

/*import java.util.*;

public class Q4 {
    public static boolean EqualArr(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array1:");
        int s1 = sc.nextInt();
        int[] arr1 = new int[s1];
        System.out.println("Enter elements of array1:");
        for (int i = 0; i < s1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of array2");
        int s2 = sc.nextInt();
        int[] arr2 = new int[s2];
        System.out.println("Enter elements of array2:");
        for (int i = 0; i < s2; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean isEqual = EqualArr(arr1, arr2);

        if (isEqual) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}
*/
import java.util.*;
public class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array");
		int size = sc.nextInt();
		int a[]= new int[size];
		int b[]= new int[size];
		System.out.println("Enter a elemnt of first array");
		for(int i = 0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter a elemnt of second array");
		for(int i = 0; i<a.length; i++)
		{
			b[i]=sc.nextInt();
		}
		
		fun(a,b);
	}
	public static void fun(int a[], int b[])
	{
		boolean flag = true;
		
		for(int i = 0; i< a.length; i++)
		{
			if(a[i]!=b[i])
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}
}