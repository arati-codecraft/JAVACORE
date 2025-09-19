/*Q26. Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.
 81=
        	
*/

import java.util.*;
public class NEONUMAPP
{
     public static void main (String args[])
        {
           Scanner sc=new Scanner (System.in);
           System.out.println("Enter the number ");
           int no=sc.nextInt();
           int temp=no;
           int rem=1;
           int s=1;
          int sum=0;
          while(no>0)
              {
                 rem=no%10;
                 no=no/10;
                 int i=1;
              
              while( i <= rem)
                {
                         s=rem*rem;        
                         i++;
                     }
                 sum +=s;
             }
           if (sum==s)
             {
               System.out.println("number is neon");
             }
           else
           {
               System.out.println("number is not neon");
             }

           
            
        } 
}
 