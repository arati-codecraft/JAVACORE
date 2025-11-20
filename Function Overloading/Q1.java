/*
Q1. Write a Java program to create a class AreaCalculator that uses function overloading to calculate the area of:
a circle using radius,
a rectangle using length and breadth, and
a triangle using base and height.
Use methods:
void area(int r)
void area(int l, int b)
void area(double b, double h)

*/

import java.util.*;

public class Q1 {

   
    public static void area(int r) {
        double result = 3.14 * r * r;
        System.out.println("Area of circle = " + result);
    }

    
    public static void area(int l, int b) {
        int result = l * b;
        System.out.println("Area of rectangle = " + result);
    }

    
    public static void area(double b, double h) {
        double result = 0.5 * b * h;
        System.out.println("Area of triangle = " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        int radius = sc.nextInt();
        area(radius);

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();
        area(length, breadth);

        // Triangle
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        area(base, height);
    }
}