public class SimpleInterest {
    public static void main(String[] args) {
        

        System.out.print("Enter Principal: ");
        double p = Double.parseDouble(args[0]);
        System.out.print("Enter Rate of interest: ");
        double r = Double.parseDouble(args[1]);
        System.out.print("Enter Time (in years): ");
        double t = Double.parseDouble(args[2]);

        double si = (p * r * t) / 100;
        System.out.println("Simple Interest: " + si);

       
    }
}
