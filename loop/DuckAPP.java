/*Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.
*/
import java.util.*;
public class DuckAPP
{
   public static void main(String args[])
     {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number to check wether it is perfect or not");
         int no=sc.nextInt();
         boolean flag=false;
      
        while(no!=0)
          {
                int rem=no%10;
                no=no/10;
                if( rem==0)
                 {
                     flag=true;
                 }
             }
              if(flag)
               {
                 System.out.println("no is duck ");
               }    
               else
                {
                   System.out.println("no is not Duck");
                  }                    
        
           
      }
}