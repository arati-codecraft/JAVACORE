/*
Q1. Write a program in java to print next greater elements in a given unsorted array. Elements for which no greater element exists, consider the next greater element as -1.
		Expected Output :
		The given array is : 5 3 10 9 6 13
		Next Bigger Elements are:
		Next bigger element of 5 in the array is: 10
		Next bigger element of 3 in the array is: 10
		Next bigger element of 10 in the array is: 13
		Next bigger element of 9 in the array is: 13
		Next bigger element of 6 in the array is: 13
		Next bigger element of 13 in the array is: -1
		Next Bigger Elements Array:
		10 10 13 13 13 -1
*/
import java.util.*;
public class Q1
{
    public static void main (String args[])
      {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
             for (int i = 0; i < n; i++)
             {
                a[i] = sc.nextInt();
              }
           int j=0;
           
           int i=0;
           int k[]=new int[a.length];
           int temp=0;
          for ( i=0;i<n;i++)
              {
                 for ( j=i+1;j<n;j++)
                     {  
                        if(a[j]>=a[i])
                         {
                             
                           System.out.print("Next Bigger Element of:"+a[i]+"in the array is"+a[j]);
                            k[temp]=a[j];
                            temp++;
                             break;
                              
                         }
                                            
                     } 
                  
                  System.out.println();
               }
              k[k.length-1]=-1;
            System.out.println("Next Bigger Elements Array:");
            for( i=0;i<k.length;i++)
		{
			System.out.print(k[i]+" ");
                }
                  
 }
}
