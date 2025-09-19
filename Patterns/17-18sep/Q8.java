/*Q8. Write a java program to print this pattern.


                   A								I
                          B						H
                              C				G
                                      D		F
                                             E
*/
import java.util.*;
public class Q8
{
   public static void main (String args[])
        {
             int c=1;
             char ch='A';
            for (int i=0;i<=5;i++)
                 {  
                    for (int j=0;j<=9;j++)
                        {    
                            if((i==j))
                             {
                                  System.out.print((char)(ch)+"\t");  
                                    ch++;  
                              }
                             else if(j==10-i)
                              {
                                 System.out.print(((char)('A'+9-i))+"\t");
                                  
                               } 
                             else 
                              {
                                  System.out.print("\t");
                              }
                                 
                            
                          }System.out.println();
                          
                          
                  }
        }
 }