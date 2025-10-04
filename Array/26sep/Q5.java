/*
Q5. Write a java program to replace all negative numbers in an array with 0.	
	Input :- arr = [2, -3, 4, -1, 5]
	Output :-  [2, 0, 4, 0, 5]
Explanation:
Each negative element is replaced with 0.
Non-negative elements remain unchanged.
*/
public class Q5 {
    public static void main(String[] args) {
        int[] arr = {2, -3, 4, -1, 5};

        // Replace negative numbers with 0
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        // Print the updated array
        System.out.print("Output :- [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}