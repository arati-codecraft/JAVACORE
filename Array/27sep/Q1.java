/*Q1. Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]


Explanation:
 Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements remain unchanged.
*/
  import java.util.*;
 public class Q1
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
            int temp=-1;
         for ( i=0;i<a.length;i++)
               {
                  if(a[i]%3==0)
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
