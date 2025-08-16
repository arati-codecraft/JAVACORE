import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1,side2,side3;
        System.out.print("Enter the three side of triangle");
        side1= sc.nextInt();
        side2= sc.nextInt();
        side3= sc.nextInt();

        String result = (side1==side2&& side2==side3) ? "Equilateral triangle" : side1==side2||side2==side3||side1==side3 ? "isosceles":"scalene";
        System.out.println("given triangle is" + result);

        
    }
}