/*
Q7. Write a java program to print this pattern.

				1
			A	B	C
		2	3	4	5	6
	D	E	F	G	H	I	J
7	8	9	10	11	12	13	14	15
*/
import java.util.*;
public class Q7
{
   public static void main (String args[])
        {
             int c=1;
             int ch='A';
            for (int i=0;i<=5;i++)
                 {  
                    for (int j=0;j<=9;j++)
                        {    
                            if((j>5-i && j<5+i) && i%2==0)
                             {
                                  System.out.print((char)(ch)+"\t");  
                                    ch++;  
                              }
                             else if((j>5-i && j<5+i) && i%2!=0)
                              {
                                 System.out.print(c+"\t");
                                   c++; 
                               } 
                             else 
                              {
                                  System.out.print("\t");
                              }
                                 
                            
                          }System.out.println();
                          
                          
                  }
        }
 }