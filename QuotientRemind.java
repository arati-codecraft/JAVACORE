import java.util.Scanner;

public class QuotientRemind{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number dividend ");
        int Dividend= sc.nextInt();

        System.out.print("Enter a number Divisor");
        int Divisor= sc.nextInt();
        
   
   int Quotient = Dividend / Divisor;
System.out.println("Quotient is " + Quotient);
int Remainder = Dividend % Divisor;
System.out.println("Remainder is " + Remainder);


        
    }
}
