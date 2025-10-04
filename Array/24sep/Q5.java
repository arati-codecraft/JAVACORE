/*Q5. Write a program in java to delete an element at desired position from an array.
	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5
*/
import java.util.*;
public class Q5
{
    public static void main (String  args[])
     {
         Scanner sc=new Scanner (System.in);
            
         System.out.println("Enter the size of array");
         int s=sc.nextInt();
        
         System.out.println("Enter the elements to the array");
         int a[]=new int[s];
          int i=0;
         for (i=0;i<a.length;i++)
              {
                    a[i]=sc.nextInt();
              }

          System.out.println("Enter the index from where you want to delete the element");
          int indx=sc.nextInt();
          indx=s-1;
          for ( i=0;i<a.length;i++)
              {
                 if (a[i]==indx&&indx<=s){
                         break;
                       }
                 else{
                     System.out.println("invalid");
                     break;
                     }
               }
            for(i=indx;i<s-1;i++)
                {
                    a[i]=a[i+1];
                }
              s--;
         
         System.out.print("The new list is: ");
        for ( i = 0; i <s; i++) {
            System.out.print(a[i] + " ");
        }

      }
}