/*
Q43. Write a Java program to check whether a given number is a Disarium number or not, and display all Disarium numbers up to n.
 A Disarium number is a number whose sum of its digits powered with their respective positions is equal to the number itself.
 Example: 135 is a Disarium number because 1¹ + 3² + 5³ = 1 + 9 + 125 = 135.
*/
import java.util.*;
public class DisariumNum
{
     public static void main(String args[])
       {
           Scanner sc=new Scanner (System.in);
            System.out.println("enter the number");
            int num=sc.nextInt();
           
                int count=0;
                int n =num;
                int sum=0;
		while(n>0) 
			{
                                 count++;
				 n/=10;
                               
		        }

		    while(n>0)	
                  {    int pow=1;
                      int digit=n%10;
              
		   for(int j=0;j<=count;j++)
		      {
	                   pow*=digit;
                        
		      }
                    sum=sum+pow;
                    count--;
                    n /=10;
	           }	
           
	
                  if (sum==num)
                       {
                         System.out.println("number is disarium");
                       }
                   else
                     {
                         System.out.println("number is not disarium");
                       }


             


            
        }
}