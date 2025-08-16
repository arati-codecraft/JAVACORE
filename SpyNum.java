import java.util.*;
public class SpyNum
{ public static void main(String x[])
{   
     Scanner xyz = new Scanner(System.in);
     int no,rem,sum=0,product;
     System.out.printf("Enter four digit number");
     no=xyz.nextInt();
     rem=no%10;
     no = no/10;
     sum=sum+rem;
     product=sum*rem;

     rem=no%10;
     no = no/10;
     sum=sum+rem;
     product=product*rem;

     rem=no%10;
     no = no/10;
     sum=sum+rem;
     product=product*rem;

     rem=no%10;
     no = no/10;
    sum=sum+rem;
   product=product*rem;
    System.out.printf("Sum is %d\n",sum);
System.out.printf("Product is %d\n",product);

String result=(sum==product)?"SpyNum":"not spynum";
System.out.println(result);



    
   
}
}