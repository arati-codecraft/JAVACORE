import java.util.*;
public class DAPP
{   public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	    int no,rem;
		boolean flag=false;
		System.out.println("Enter number from keyboard");
		no=xyz.nextInt();
		System.out.println("Enter search key");
		int skey=xyz.nextInt();
		while(no!=0)
		{
		   rem  = no % 10;
		   no  = no /10;
		   if(rem == skey)
		   { flag=true;
		   }
		   }
		  String msg=flag?"Number found":"Number not found";
		  System.out.println(msg); 
	}
}
