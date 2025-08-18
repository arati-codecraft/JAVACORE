import java.util.Scanner;
public class Vote
{
     public static void main(String args[ ])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age:");
        int Age = sc.nextInt();
        System.out.println("the age is "+Age);
        String result=(Age>=18)? "able to vote" : "Notable to vote";
        System.out.println(result);
        
     }
}
