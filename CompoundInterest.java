public class CompoundInterest {
    public static void main(String[] args) {
       

        System.out.print("Enter Principal: ");
        double p = Double.parseDouble(args[1]);
        System.out.print("Enter Rate of interest: ");
        double r =Double.parseDouble(args[2]);
        System.out.print("Enter Time (in years): ");
        double t = Double.parseDouble(args[3]);

        double amount = p * Math.pow((1 + r / 100), t);
        double ci = amount - p;

        System.out.println("Compound Interest: " + ci);

        
    }
}
