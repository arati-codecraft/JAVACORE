public class EquilateralArea {
    public static void main(String[] args) {
        int side=Integer.parseInt(args[0]);

         double area= (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of equilateral triangle: " + area);

       
    }
}

