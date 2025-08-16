

public class SwapWithThird {
    public static void main(String[] args) {
         System.out.print("Enter first number: ");
        int a = Integer.parseInt(args[0]);
        System.out.print("Enter second number: ");
       int b = Integer.parseInt(args[1]);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);

        
       }
}