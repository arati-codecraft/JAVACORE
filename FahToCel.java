public class FahToCel {
    public static void main(String[] args) {
      

        System.out.print("Enter temperature in Fahrenheit: ");
        double fah = Double.parseDouble(args[0]);

        double cel = (fah - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + cel);

        
    }
}
