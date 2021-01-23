import java.util.Scanner;

public class SumOfNumberInArray {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the element ");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the elements of array");
int sum=0;
for(int i=0;i<n;i++)
{ 
	a[i]=s.nextInt();
	sum=sum+a[i];
	
}
System.out.println("sum is"+sum);
	}

}
