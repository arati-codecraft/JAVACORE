/*
Q4. Write a java program to copy one array to another array.
Input:
Array1 = {5, 10, 15, 20}
Output:
Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment.
*/

import java.util.*;
public class Q4
{
   public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
             
        int []  a1={5, 10, 15, 20};
        int []  a2=a1;
          
         System.out.println("original array= ");
         for(int i=0; i<a1.length; i++)
            {
              System.out.print(a1[i]+"\t");        
             }
             System.out.println();
    
            System.out.println("copied array=");
           for(int i=0;i<a2.length;i++)
            {
              System.out.print(a2[i]+"\t");             
             }
         

      }
}