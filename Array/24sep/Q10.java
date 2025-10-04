/*
Q10. Write a java program to find common elements between two arrays.
Input:
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation:
Compare each element of Array1 with all elements of Array2, if match found → it is a common element.
*/

import java.util.*;
public class  Q10
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the size of first array");
        int n=sc.nextInt();

        System.out.println("Enter the size of second array");
        int s=sc.nextInt();
         
               
       System.out.println("enter the element of first and second  array");
       int a1[]=new int[n];
       int a2[]=new int[s];
     
       for (int i=0;i<n;i++)
          {
             a1[i]=sc.nextInt();
               
           }
        for (int i=0;i<s;i++)
          {
             a2[i]=sc.nextInt();
               
           }


          for(int i=0;i<n;i++)
             {
                for (int j=0;j<s;j++)
                 {
                    if(a1[i]==a2[j])
                       {
                          System.out.print(a1[i] +"  ");
                          break;
                        }
                  }
              }           

            
      
         
                
              

       
    }
}
