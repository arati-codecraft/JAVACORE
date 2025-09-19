//Q33. Write a java program to display 1 to nth Armstrong Number.

/* import java.util.*;
public class ArmstrongAPP
{
     public static void main (String args[])
        {
           Scanner sc=new Scanner (System.in);
           System.out.println("Enter the number to print armstrong number upto n");
           int no=sc.nextInt();
           int temp=no;
           int rem=1;
           int c=1;
          int sum=0;
          while(no>0)
              {
                 rem=no%10;
                 no=no/10;
                 int i=1;
              
              while( i <= rem)
                {
                      c=rem*rem*rem;        
                         i++;
                     }
                 sum +=c;
             }
             
           if (sum==no)
             {
               System.out.println(no);
              
             }
            no++;
            
        } 
}*/


import java.util.*;

public class ArmstrongAPP {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print Armstrong numbers up to n: ");
        int n = sc.nextInt();

         for (int num = 1; num <= n; num++) 
            {
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int rem = temp % 10;
                sum += rem * rem * rem; // cube of digit
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}

