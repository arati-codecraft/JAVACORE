import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        String result = (sp > cp) ? "Profit of " + (sp - cp) : 
                        (sp < cp) ? "Loss of " + (cp - sp) : "No Profit No Loss";
        System.out.println(result);
    }
}
