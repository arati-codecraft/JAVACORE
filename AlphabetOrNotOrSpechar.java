import java.util.Scanner;

public class AlphabetOrNotOrSpechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        String result = ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) ? "Alphabetic" : 
                        ((ch >= '0' && ch <= '9') ? "Digit" : "Special character");
        System.out.println(result);
    }
}
