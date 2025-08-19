//Take two integers m and n. Use the ternary operator to print whether the absolute difference between them is greater than 10 or not.
//Example Input m = 25, n = 12
  

import java.util.Scanner;
public class Difference{
               public static void main (String args[])
                 { 
                     Scanner sc =new Scanner(System.in);
                      System.out.println("enter the two numbers");
                      int m= sc.nextInt();
                        int n= sc.nextInt();
                      System.out.println("value of m"+m);
                      System.out.println("value of n"+n);

                    String result=(m-n>10)?" greater":" not greater";
                    System.out.println("difference is"+result);

                  }
}