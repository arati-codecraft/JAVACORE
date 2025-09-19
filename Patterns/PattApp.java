/*1. *****
    *****
    *****
    *****
    *****

import java.util.*;
public class PattApp
{
     public static void main (String args[])
       {
             Scanner sc=new Scanner (System.in);
            for(int i=1;i<=5;i++)
              {
                    for (int j=1;j<=5;j++)
                        {
                               System.out.print("* ");
                        }
                     System.out.println();
               }
          
       }
}

2. *
    **
    ***
    ****
    *****


import java.util.*;
public class PattApp
{
     public static void main (String args[])
       {
             Scanner sc=new Scanner (System.in);
            for(int i=1;i<=5;i++)
              {
                    for (int j=1;j<=i;j++)
                        {
                               System.out.print("* ");
                        }
                     System.out.println();
               }
          
       }
}

3.*****
    ****
    ***
    **
    *

import java.util.*;
public class PattApp
{
     public static void main (String args[])
       {
             Scanner sc=new Scanner (System.in);
            for(int i=1;i<=5;i++)
              {
                    for (int j=i;j<=5;j++)
                        {
                               System.out.print("* ");
                        }
                     System.out.println();
               }
          
       }
}

4. 1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

import java.util.*;
public class PattApp
{
     public static void main (String args[])
       {
             Scanner sc=new Scanner (System.in);
            for(int i=1;i<=5;i++)
              {
                    for (int j=1;j<=i;j++)
                        {
                               System.out.print(j);
                        }
                     System.out.println();
               }
          
       }
}

6.      *
        **
       ***
      ****
     *****

*/


import java.util.*;
public class PattApp
{
     public static void main (String args[])
       {
             Scanner sc=new Scanner (System.in);
            for(int i=1;i<=5;i++)
              {
                    for (int j=1;j<=5;j++)
                        {
                                if(j<=5-i){
                               System.out.print(" ");
                                 }
                               else{ 
                               System.out.print("*");
                                }
                        }
                     System.out.println();
               }
          
       }
}



