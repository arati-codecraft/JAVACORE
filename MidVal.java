//Write a Java program using the conditional (ternary) operator to find the middle value among three distinct integers p, q, and r.
//Example Input:p = 10, q = 20, r = 15



import java.util.Scanner;
public class MidVal{
               public static void main (String args[])
                 { 
                     Scanner sc =new Scanner(System.in);
                      System.out.println("enter the three numbers");
                      int p= sc.nextInt();
                        int q= sc.nextInt();
                        int r= sc.nextInt();
                      System.out.println("value of p"+p);
                      System.out.println("value of q"+q);
                      System.out.println("value of r"+r);

                    String result=(p<q&&q<r)?" q is mid value":(p>r&&r>q)?"r is mid value":"p is mid value";
                    System.out.println(result);

                  }
}