	/*

Q5. Write a Java program to count even & odd values from an array.
Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
Explanation:
Initialize counters: evenCount = 0, oddCount = 0.


For each element in the array:


If divisible by 2 → increase evenCount.
Otherwise → increase oddCount.


Final counts are displayed.


*/

import java.util.*;
public class Q5
{
     public static void main (String args[])
       {
           Scanner sc=new Scanner (System.in);
           System.out.print("enter the 7 values ");
           int a[]=new int[7];
            int evenCnt=0,oddCnt=0;
            for (int i=0;i<7;i++)
              {
                   a[i]=sc.nextInt();
              }

           System.out.println("Even count =");
            for (int i=0;i<7;i++)
               {
                   if(a[i]%2==0)
                       {
                        
                         evenCnt++;
                        } 
                   
                }System.out.println(evenCnt);


           System.out.println("odd count =  ");
            for (int i=0;i<7;i++)
               {
                   if(a[i]%2!=0)
                       {
                        
                         oddCnt++;
                        }
                   
                } System.out.println(oddCnt);


          

       }
}