//Q55. Take a three-digit number and print whether the middle digit is greater than the sum of the first and last digits using the ternary operator.
//Example:Input: num = 572 → Middle digit 7 vs (5+2)=7 → Equal or Not Greater



import java.util.Scanner;
public class MidEual{
                     public static void main(String args[])
                     {
                        Scanner sc=new Scanner(System.in);
                        System.out.println("Enetr the three digit number");
                        int num=sc.nextInt();
                        System.out.println("the num is"+num);
                         int dgt1=num/100;
                         int mdgt=(num/10)%10;
                         int ldgt=num%10;
                      
                         System.out.println("firstDigit1 is"+dgt1);
                          System.out.println("lastDigit is"+ldgt);
                           System.out.println("MidDigit is"+mdgt);
                           
                           int sum=dgt1+ldgt;
                           
                          String result=(sum>=mdgt)?"NotGreater or Equal ":"greater";
                          System.out.println("middle digit is "+result);
                        
                     }
}