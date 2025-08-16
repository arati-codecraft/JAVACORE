public class CelToFah {
    public static void main(String[] args) {
       System.out.print("Enter temperature in Celsius: ");
        double cel = Double.parseDouble(args[0]);

        double fah = (cel * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fah);

      
    }
}

