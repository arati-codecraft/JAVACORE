import java.util.Scanner;
public class Result{
         public static void main(String args[])
            {
              Scanner sc =new Scanner(System.in);
              int marks;
              System.out.println("Enter the marks of subjects out of hundred:");
              marks=sc.nextInt();
              System.out.println("marks are"+marks);
               
            String result=(marks>=90)?"excellent":(marks>=75)?"good":(marks>=50)?"average":"poor";
              System.out.println(result);
             
            } 
}


