//Q1. Write a java program to print all natural numbers from 1 to n. using while loop
import java.util.*;

public class Q1 {
    
    public static void printNaturalNumbers(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        printNaturalNumbers(++i, n); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        printNaturalNumbers(1, n); 
    }
}

