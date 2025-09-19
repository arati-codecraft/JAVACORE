/*Q42. Write a Java program to check whether a given number is a Kaprekar number or not, and to display all Kaprekar numbers up to n.
A Kaprekar number is a non-negative integer, the representation of whose square can be split into two parts that add up to the original number itself.
 For example:
9² = 81 → split as 8 and 1 → 8 + 1 = 9
45² = 2025 → split as 20 and 25 → 20 + 25 = 45
*/

import java.util.*;
public class KaprekarNum
{
     public static void main(String args[])
       {
           Scanner sc=new Scanner (System.in);
            System.out.println("enter the limit");
            int lim=sc.nextInt();
             int lastdig=0;
            for(int i=1;i<=lim;i++)
            {
                  int n=i; // 25
		int squ=n*n; // 625
		int count=0;  // 0
		int temp=i; // 25
                

		while(temp>0) // t
			{
				count++; // 2
				temp/=10; // 2
		        }

		int mod=1;
		for(int j=0;j<count;j++)
		{
			mod*=10; // 100
                        
		}
		

	
                  if (squ >= mod && (squ / mod + squ % mod) == i)
                       {
                         System.out.println(i);
                       }


             }


            
        }
}