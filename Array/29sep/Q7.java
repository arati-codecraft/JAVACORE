/*
Q7. Write a java program to merge two arrays.

	Input - First Array :- 1 2 3 4 5
             	  Second Array :-  6 7 8 9 10 
	Output - 1 10 2 9 3 8 4 7 5 6
*/
import java.util.*;
public class Q7
{
    public static void main (String args[])
      {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array:");
        int n1 = sc.nextInt();
       System.out.println("Enter the size of the first array:");
        int n2 = sc.nextInt();

        int[] a = new int[n1];
        System.out.println("Enter the elements of the first array:");
             for (int i = 0; i < n1; i++)//1 2 3  4 5
             {
                a[i] = sc.nextInt();
              }

          System.out.println("Enter the element of 2nd array");
          int b[]=new int[n2];
               for (int i = 0; i < n2; i++)//6 7 8 9 10
             {
                b[i] = sc.nextInt();
              }

          int m[]=new int[a.length+b.length];//0 1 2 3 4 5 6 7 8  9
                  int ind=0;
                

          for (int i=0;i<n1;i++)
                 {
                    m[ind++]=a[i];
                   m[ind++]=b[n2-1-i];
                  
                  }
           System.out.println("Array after merge");
         for (int i=0;i<m.length-1;i++)
               {
                    System.out.print(m[i] + "  ");
               }
                                                        
             }
}   

