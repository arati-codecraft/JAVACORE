/*
Q6. Create a new array where each element is the square of the original.
Input: arr = [2, 4, 6, 8]
Output: newArr = [4, 16, 36, 64]
Explanation: For each index, calculate arr[i] * arr[i] and store it in the new array.
*/
import java.util.*;
public class Q6
{
   public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array");
         int s=sc.nextInt();
         
        System.out.println("Enter the elemnt of array");
         int a1[]=new int[s];
         
        int a2[]=a1;
       
        for (int i=0;i<s;i++)
             {
                a1[i]=sc.nextInt();
               
             }
             System.out.print("square of array =");
           int i=0;
          for ( i=0;i<s;i++)
           {
               a2[i]=a1[i]*a1[i];
               System.out.print( a1[i]+"  ");
               
           }
         
    }
}