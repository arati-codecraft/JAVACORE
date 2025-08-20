
import java.util.Scanner;
public class  AreaOfCircle
{
        public static void main(String args[])
         {
           Scanner sc =new Scanner(System.in);
           System.out.println("Enter the radius");
            int radius=sc.nextInt();
             System.out.println("radius="+radius);
             int diameter=2*radius;
             System.out.println("Diameter of circle is="+diameter);
             double circumference=2*3.14*radius;
             System.out.println("circumference of circle is="+circumference);
             double area = 3.14 * radius*radius;
              System.out.println("area"+area);
          }
}