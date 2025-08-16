import java.util.Scanner;
public class ASCIIToggle{

public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the character you Want to Toggle");
  char ch=sc.next().charAt(0);
  int ascii=(int)ch;
   
int result =ch >='a' && ch <= 'z' ? ch-32 : ch+32;
System.out.print((char)result);
  
  
  
}
}