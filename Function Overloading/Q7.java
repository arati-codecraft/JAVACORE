import java.util.*;

public class Q7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input for unique elements
        System.out.println("Enter the size of array:");
        int s = sc.nextInt();
        int[] a = new int[s];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Input for common elements
        System.out.println("Enter the size of second and third arrays:");
        int s1 = sc.nextInt();
        int[] a2 = new int[s1];
        int[] a3 = new int[s1];
        System.out.println("Enter the elements of array2:");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of array3:");
        for (int i = 0; i < a3.length; i++) {
            a3[i] = sc.nextInt();
        }

        // Call overloaded functions
        analyze(a);
        analyze(a2, a3);
    }

    // Version 1: Print unique elements
    public static void analyze(int[] a) {
        System.out.print("Unique: ");
        for (int i = 0; i < a.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < a.length; j++) {
                if (i != j && a[i] == a[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }

    // Version 2: Print common elements
    public static void analyze(int[] a, int[] b) {
        System.out.print("Common: ");
        for (int i = 0; i < a.length; i++) {
            boolean isCommon = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    isCommon = true;
                    break;
                }
            }
            // Check if already printed
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (a[k] == a[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (isCommon && !alreadyPrinted) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
    }
}