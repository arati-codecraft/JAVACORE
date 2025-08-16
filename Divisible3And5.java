import java.util.Scanner;

public class Divisible3And5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = (num % 3== 0 && num % 5== 0) 
                        ? "Divisible by both 3 and 5" 
                        : "Not Divisible by both 3 and 5";
        
        System.out.println(result);

        sc.close();
    }
}
