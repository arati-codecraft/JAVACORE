import java.util.*;
class DaysToM{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no days");
        int d = sc.nextInt();
        int y = d / 365;
        int m = (d /365) /30;
        int w = ((d % 365) %30) / 7;
        System.out.println(y + "y " + m + "m " + w + "w");
    }
}
