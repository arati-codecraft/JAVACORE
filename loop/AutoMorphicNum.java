/*Q40. Write a Java program to print all automorphic numbers between 1 and n. An automorphic number’s square ends with the number itself (e.g., 5² = 25).
 Explanation:
 Use loop to check square and a while loop to match last digits.*/

import java.util.*;
public class AutoMorphicNum
{
      public static void main(String args[])
       {
            Scanner sc=new Scanner (System.in);
            System.out.println("enter the limit");
            int lim=sc.nextInt();
             int lastdig=0;
            for(int i=1;i<=lim;i++)
            {
                  int n=i;
int squ=n*n;
int count=0;
int temp=i;
while(temp>0)
{
	count++;
	temp/=10;
}

int mod=1;
for(int j=0;j<count;j++)
{
	mod*=10;

}
		

	
                  if (squ%mod==i)
                       {
                         System.out.println(i);
                       }
System.out.println();

             }

       }
}