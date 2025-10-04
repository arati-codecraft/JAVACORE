/*Q4. Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
Output: true


Explanation:
 A palindrome reads the same forward and backward.
 Forward: 1 2 3 2 1
 Backward: 1 2 3 2 1
 Since both are the same, the array is a palindrome.
*/
import java.util.*;
public class Q4
{
   public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of array");
        int s=sc.nextInt();

        System.out.println("enter the element of array");
         int a[]=new int[s];

        for (int i=0;i<s;i++)
           {
               a[i]=sc.nextInt();
           }
         int i,j;
          for(i=0, j=s-1;  i<=j;  i++ ,j--)
           {
             if (a[i]!=a[j])
                 {
                     System.out.println("array is not palindrome");
                     break;
                 }
           }
              if (i>j)
                 {
                     System.out.println("array is palindrome");
                 }

    }
}