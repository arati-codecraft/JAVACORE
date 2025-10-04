/*
Q3. Write a program in java to move all zeroes to the end of a given array.
		Expected Output :
		The given array is : 2 5 7 0 4 0 7 -5 8 0
		The new array is:
		2 5 7 8 4 -5 7 0 0 0
*/
import java.util.*;
public class  Q3
{
   public static void main (String args[])
     {
          Scanner sc=new Scanner (System.in);
            System.out.println("Enter the size of array");
            int s=sc.nextInt();
        
         System.out.println("Enter the element of an array");
         int a[]=new int[s];
         
     
         for (int i=0;i<s;i++)
         {
            a[i]=sc.nextInt();
         }
         int j=0;
        for (int i=0;i<s;i++)
          {
            
             if(a[i]!=0)
             {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
             }
        

         }
         System.out.println("Array after rotation:");
        for (int i = 0; i < s; i++) 
          {
            System.out.print(a[i] + " ");
        }

      }
}