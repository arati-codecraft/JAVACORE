/*Q3. Replace all elements in the array that are multiples of 5 with the number 5 itself.
Input: [10, 12, 15, 17, 20]
Output: [5, 12, 5, 17, 5]

10 is divisible by 5 → replaced with 5.
12 is not divisible by 5 → unchanged.
15 is divisible by 5 → replaced with 5.
17 is not divisible by 5 → unchanged.
20 is divisible by 5 → replaced with 5.
*/

 import java.util.*;

 public class Q3
{
    public static void main (String args[])
     {
         Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array");
        int s=sc.nextInt();
 
        System.out.println("Enter the element of array ");
        int a[]=new int[s];
        int i=0;
       for ( i=0;i<a.length;i++)
          {
              a[i]=sc.nextInt();
           }
            int temp=5;
         for ( i=0;i<a.length;i++)
               {
                  if(a[i]%5==0)
                     {
                         a[i]=temp;
                          System.out.print(a[i]+" ");
                      }
                   else
                      {
                         System.out.print(a[i] +" ");
                      }
               }
            

     }
}