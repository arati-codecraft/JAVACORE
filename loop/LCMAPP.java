//Q37. Write a java program to find LCM of two numbers.

import java.util.*;
public class LCMAPP
{
     public static void main(String args[])
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("enter the two number");
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int a=n1,b=n2;
             int lcm=1;
            while (b!=0)
             {
                 int temp=b;
                 b=a%b;
                 a=temp;
                 
                  
              }
            System.out.println("hcf of both number is "+ a);
             int l=(n1*n2)/a;
             System.out.println("LCM of number is "+  l);
          
           
         }
}