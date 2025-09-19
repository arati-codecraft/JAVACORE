//Q20. Write a java program to swap first and last digits of a number.
import java.util.*;
public class SWAPP
{
       public static void main (String args[])
         {
                Scanner sc=new Scanner(System.in);
                 System.out.println("enter the num");
                int num= sc.nextInt();
           
                int temp=num;
                int n=1;
                int c=0;
                while (num>0)
                 {
                   num=num/10;   
                      c++;               
                 }
                  int i=1;
                 while(i<c)
                    {
                        n=n*10;
                        i++;
                    }                
                   int last=(temp%10);
                //System.out.println(last*n);
                  temp=temp/10;
                  int first=temp/100;
                  temp=temp%100;
                 int s=last*n+temp*10+first;
                  System.out.println(s);
                          
           }
}