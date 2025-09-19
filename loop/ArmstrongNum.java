/*Q25. Write a java program to Check Number Is Armstrong Number or Not.
Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.
      For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.
*/

 import java.util.*;
public class ArmstrongNum
{
     public static void main (String args[])
        {
           Scanner sc=new Scanner (System.in);
           System.out.println("Enter the number ");
           int no=sc.nextInt();
           int temp=no;
           int rem=1;
           int c=1;
          int sum=0;
          while(no>0)
              {
                 rem=no%10;
                 no=no/10;
                 int i=1;
              
              while( i <= rem)
                {
                        c=rem*rem*rem;        
                         i++;
                     }
                 sum +=c;
             }
           if (sum==temp)
             {
               System.out.println("number is armstrong");
             }
           else
           {
               System.out.println("number is not armstrong");
             }

           
            
        } 
}
 