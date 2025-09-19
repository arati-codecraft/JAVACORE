/*
Q2. Write a java program to print this pattern.
*****
****
***
**
*          */


import java.util.*;
public class Pyramid2APP
{
     public static void main (String args[])
       {
            for (int i=1 ; i<=5 ; i++)
               {
                    for (int j=1 ; j<=5; j++)
                       {
                          if (j>=i){
                            System.out.print("*");
                          } 
                        }
                     System.out.println( );
                }
        }
}
