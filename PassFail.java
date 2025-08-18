import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks:");
        int marks=sc.nextInt();
        System.out.println("the marks are:"+marks);


        String result=(marks>=40)?"pass":"fail";
        System.out.println(result);        
    }
}
