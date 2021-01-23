import java.util.Scanner;
public class AvgOfNumber1 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
double avg=avgOfNumber(n);
System.out.println(avg);
	}
	static int noOfDigit(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}

	private static double avgOfNumber(int n) {
		double avg=0;
		double sum=0;
		int count=noOfDigit(n); 
		while(n!=0){
		int r=n%10;
		 sum=sum+r;
		 n=n/10;
		}
		return avg=sum/count;
	
}}