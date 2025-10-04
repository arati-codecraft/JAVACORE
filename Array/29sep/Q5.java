/*
Q5. Write a java program to take input array from user and perform all operations in array.
Input Array :  5732  8659  2534  9625  7354  1325
	
Case 1 :  Sort Number In Ascending Order.
	    Output :- 2357  5689  2345  2569  3457  1235 
				
Case 2 : Sort Number In Descending Order.
  Output :- 7532  9865  5432  9652  7543  5321
				
Case 3 : Store sum of digits at same index.
	  Output :-  17  28  14  22  19  11
	
Case 4 : Store the even number at the first and odd number at the last of digit at same index.
	   Output :-  2573  6859  4253  2695  4735  2135
				
Case 5 : Store only prime number at the same index of digit.
		Output :- 2573  5  253  25  357  235
*/

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nChoose Operation:");
        System.out.println("1. Sort digits in Ascending Order");
        System.out.println("2. Sort digits in Descending Order");
        System.out.println("3. Sum of digits");
        System.out.println("4. Even digits first, odd digits last");
        System.out.println("5. Only prime digits");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                for (int i = 0; i < arr.length; i++) {
                    String num = String.valueOf(arr[i]);
                    char[] digits = num.toCharArray();
                    java.util.Arrays.sort(digits);
                    System.out.print(new String(digits) + " ");
                }
                break;

            case 2:
                for (int i = 0; i < arr.length; i++) {
                    String num = String.valueOf(arr[i]);
                    char[] digits = num.toCharArray();
                    java.util.Arrays.sort(digits);
                    for (int j = 0, k = digits.length - 1; j < k; j++, k--) {
                        char temp = digits[j];
                        digits[j] = digits[k];
                        digits[k] = temp;
                    }
                    System.out.print(new String(digits) + " ");
                }
                break;

            case 3:
                for (int i = 0; i < arr.length; i++) {
                    int num = arr[i], sum = 0;
                    while (num > 0) {
                        sum += num % 10;
                        num /= 10;
                    }
                    System.out.print(sum + " ");
                }
                break;

            case 4:
                for (int i = 0; i < arr.length; i++) {
                    String num = String.valueOf(arr[i]);
                    String even = "", odd = "";
                    for (int j = 0; j < num.length(); j++) {
                        char c = num.charAt(j);
                        if ((c - '0') % 2 == 0)
                            even += c;
                        else
                            odd += c;
                    }
                    System.out.print(even + odd + " ");
                }
                break;

            case 5:
                for (int i = 0; i < arr.length; i++) {
                    String num = String.valueOf(arr[i]);
                    String prime = "";
                    for (int j = 0; j < num.length(); j++) {
                        char c = num.charAt(j);
                        if (c == '2' || c == '3' || c == '5' || c == '7')
                            prime += c;
                    }
                    if (prime.equals("")) prime = "0";
                    System.out.print(prime + " ");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}