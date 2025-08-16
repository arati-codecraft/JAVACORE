public class MarksPercentage {
    public static void main(String[] args) {
        double total = 0;
        for (String arg : args) {
            total += Double.parseDouble(arg);
        }
        double percentage = (total / 500) * 100;
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}

