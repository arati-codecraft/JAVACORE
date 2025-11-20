/*
9. Convert Celsius to Fahrenheit
Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
Explanation: Demonstrates unit conversion logic.
*/

import java.util.*;

class TemperatureConverter
{
  private int temp, f;
  private Scanner sc=new Scanner(System.in);
  public void setTemp()
  {
    System.out.println("Enter the temperature in celsius");
	temp=sc.nextInt();
  }
  public void getTemp()
  {
    f=(temp * 9 / 5) + 32;

	System.out.println("temperature after conversion"+f);
  }
}
public class Q9CLOB
{
  public static void main(String args[])
  {
    TemperatureConverter tc=new TemperatureConverter();
	tc.setTemp();
	tc.getTemp();
  }
}