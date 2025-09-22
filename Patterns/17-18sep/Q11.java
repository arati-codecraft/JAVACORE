/*Q75. Write a java program to print this pattern.

									A
                                                         1	2	1
                                         A	B	C	B	A
                         1	2	3	4	3	2	1
         A	B	C	D	E	D	C	B	A
*/


import java.util.*;
public class Q11
{
   public static void main (String args[])
        {   
           
           
               int temp=1;
              
              for(int i=1;i<=5;i++)
                   {  char ch='A';
                        int c=1;
                        int n=1;
                     for(int j=1;j<=9;j++)
                           {     
                               if(j>=10-temp&&i%2!=0)
                                  {
                                     System.out.print(ch+"\t");
                                     c++;
                                     if(c<=i)
                                         {
                                            ch++;
                                          }
                                        else
                                           {
                                              ch--;                                      
                                           }
 
                                      }
                                 else if (j>=10-temp&&i%2==0)
                                   {
                                      System.out.print(n+"\t");
                                       c++;
                                    if(c<=i)
                                         {
                                             n++;
                                           }
                                        else
                                           {
                                              n--;
                                            
                                            }
                                   
                                   }
                                 else
                                   {
                                     System.out.print("\t");
                                    }
                                 
                            }System.out.println();
                          temp=temp+2;
                      }                        
                  
        }
}