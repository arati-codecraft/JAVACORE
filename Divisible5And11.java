import java.util.Scanner;

public class Divisible5And11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num % 5 == 0 && num % 11 == 0) 
                        ? "Divisible by both 5 and 11" 
                        : "Not Divisible by both 5 and 11";
        
        System.out.println(result);

        sc.close();
    }
}
