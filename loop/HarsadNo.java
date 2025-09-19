//Q39. Write a Java program to check whether a given number is a Harshad number (i.e., divisible by the sum of its digits) for numbers from 1 to n.
import java.util.*;
public class HarsadNo
{
   public static void main(String args[])
      {
            Scanner sc=new Scanner(System.in);
             System.out.println("Enter the number");
	     int n=sc.nextInt();
                 int i=0;
                int  sum=0;
                   int temp=n;
               while(n!=0)
                  {
                       
                       int rem=n%10;
                       sum +=rem;
                       n /=10;
                    
                    }
                
              if (temp%sum==0)
                  {
                    System.out.println("number is harsad number");
                  }
                else
                    {
                    System.out.println("number is not harsad number");
                  }

      }
}
