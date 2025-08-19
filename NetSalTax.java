//Q56. Write a Java expression using arithmetic and assignment operators to calculate net salary if:
//basicSalary = 35000  taxRate = 12%   Find netSalary.   NetSal=GS-(GS/NetSal);

import java.util.Scanner;
public class NetSalTax{
                     public static void main(String args[])
                     {
                        Scanner sc=new Scanner(System.in);
                       int Bs=35000;
                       double tax=0.12;
                       tax=Bs*tax;
                       double NetSal=Bs-tax;
                       System.out.println("Netsalary is "+NetSal);
                      }
}