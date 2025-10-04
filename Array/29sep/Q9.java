/*
Q9. You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits. 

Example 1: 
Input: digits = [1,2,3]    
Output: [1,2,4] 
Explanation: The array represents the integer 123. 
Incrementing by one gives 123 + 1 = 124. 
Thus, the result should be [1,2,4]. 

Example 2: 
Input: digits = [4,3,2,1]   
Output: [4,3,2,2] 
Explanation: The array represents the integer 4321. 
Incrementing by one gives 4321 + 1 = 4322. 
Thus, the result should be [4,3,2,2]. 

*/

import java.util.*;
public class Q9
{
   public static void main (String args[])
     {
          Scanner sc=new Scanner (System.in);
            System.out.println("Enter the size of array");
            int s=sc.nextInt();
        
         System.out.println("Enter the element of an array");
         int a[]=new int[s];
         int i=0;
     
         for ( i=0;i<s;i++)
         {
            a[i]=sc.nextInt();
         }

       int c=a.length;
       System.out.println(c);

       int x=1;
       i=1;
       while (i<c)
            {
                x=x*10;
                i++;
             }
       int num=0;
       for ( i=0;i<s;i++)
        {
            num=num+a[i]*x;
            x=x/10;
        }
     num=num+1;
    for ( i=a.length-1;i>=0;i--)
        {
           a[i]=num%10;
           num /=10;
         }
      for( i=0;i<s;i++)
        {
             System.out.print(a[i]+ "  ");
         }
    }  
}