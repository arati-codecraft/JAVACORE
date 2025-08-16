import java.util.Scanner;

public class AlphabeticOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);


        String result = (((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) ? "alphabetic" : "notAlphabetic";

        System.out.println(result);

        
    }
}
