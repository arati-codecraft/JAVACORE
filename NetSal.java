import java.util.Scanner;
public class NetSal{

public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the basic Salary");
  int bs=sc.nextInt();
  System.out.println("Enter the DA");
  int Da=sc.nextInt();
  Da=bs/Da;
 System.out.println("DA is"+Da);

System.out.println("Enter the  hra");
  int Hra=sc.nextInt();
  Hra=bs/Hra;
System.out.println("Hra is"+Hra);

int GS=bs+Da+Hra;
System.out.println("Gross Salary is "+GS);
System.out.println("enter the net salary");
int NetSal=sc.nextInt();
NetSal=GS-(GS/NetSal);
System.out.println("net salary is"+NetSal);


  
   
  
}
}