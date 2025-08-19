//Q53. Take percentage and income of a student: If percentage >= 75 AND income < 200000, print "Eligible"Else "Not Eligible"

import java.util.Scanner;
public class PerIncom{
               public static void main (String args[])
                 { 
                     Scanner sc =new Scanner(System.in);
                      System.out.println("enter the percentage");
                          int perc= sc.nextInt();
                      System.out.println("enter the income");
                         int incom= sc.nextInt();
                        
                      System.out.println("student percentage"+perc);
                      System.out.println("student income"+incom);
                      

                    String result=(perc>=75&&incom<200000)?"Elgible ":"not eligible";
                    System.out.println(result);

                  }
}