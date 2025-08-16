

public class Conversion{
    public static void main(String[] args) {
        

        System.out.print("Enter length in centimeters: ");
        double cm = Double.parseDouble(args[0]);

        double meters = cm / 100;
        double kilometers = cm / 1000;

        System.out.println("Length in meters: " + meters);
        System.out.println("Length in kilometers: " + kilometers);

        
    }
}
