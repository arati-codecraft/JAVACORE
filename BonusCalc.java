//If performance rating > 8, give 15% bonus; else if rating > 5, give 10% bonus; otherwise, no bonus. Use relational operators to implement logic

import java.util.Scanner;

public class BonusCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter performance rating: ");
        double rating = sc.nextDouble();
        double bonus = (rating > 8) ? 0.15 : (rating > 5) ? 0.10 : 0;
        System.out.println("Bonus percentage: " + bonus * 100 + "%");
    }
}