/*
Q4.Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]
Explanation:
Even and odd elements are rearranged to appear alternately: Even → Odd → Even → Odd.
The relative order within even and odd groups may not be important, but alternation is maintained.
*/
import java.util.*;
 class  Q4{
	 public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter size:");
		 int n=sc.nextInt();
		 int a[]=new int[n];
		 int i=0;
		 System.out.println("Enter array elements:");
		 for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		 }
		 
		 for(i=0;i<n-1;i++){
		 if(a[i]%2!=0 && i%2==0)
		 {
			 int temp=a[i];
			 a[i]=a[i+1];
			 a[i+1]=temp;
			 }
		 }
		 System.out.println("New array:");
		 for(i=0;i<n;i++){
			 System.out.print(a[i]+" ");
		 }
			 
	 }
 }