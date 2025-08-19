//take a three-digit number and print the larger digit among first and last digit using ternary operator.


import java.util.Scanner;
public class LarPosNum{
                     public static void main(String args[])
                     {
                        Scanner sc=new Scanner(System.in);
                        System.out.println("Enetr the three digit number");
                        int num=sc.nextInt();
                        System.out.println("the num is"+num);
                         int dgt1=num/100;
                         int ldgt=num%10;
                         System.out.println("firstDigit1 is"+dgt1);
                          System.out.println("lastDigit is"+ldgt);
                        
                          String result=(dgt1<ldgt)?"last digit is greater":"first digit is greater";
                          System.out.println(result);
                        
                     }
}