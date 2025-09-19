/*
Q12. Write a java program to print this pattern.

A	B	C	D	E
A	B	C	D	E
A	B	C	D	E	
A	B	C	D	E
A	B	C	D	E

*/
import java.util.*;
public class Q12
{
   public static void main (String args[])
        {
            for (int i=0;i<5;i++)
                 {
                    for (int j=0;j<5;j++)
                        {
                           
                            System.out.print((char) ('A'+j)+"\t");
                                
                                                            
                         }System.out.println();
                  }
        }
 }