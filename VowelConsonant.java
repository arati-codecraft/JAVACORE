import java.util.Scanner;

public class VowelConsonant{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Alphabet : " );
      char ch = sc.next().charAt(0);


        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? "Vowel" 
                        : "Consonant";

        System.out.println(result);

        
    }
}
