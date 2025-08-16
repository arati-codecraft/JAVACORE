import java.util.Scanner;
class LeapYear
    {
  public static void main(String args[]){
   System.out.println("Enter the year");
  Scanner sc=new Scanner(System.in);
  int year =sc.nextInt();
  
  String result=(year%4==0)? "leap" : "notleap";
 System.out.println("year is "+result);
     }
}
