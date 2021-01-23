import java.util.Scanner;
public class SumOfInteger {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the no");
		int n=scn.nextInt();
		int sum=SumOfDigits(n);
		System.out.println("sum of digit"+sum);

	}
	static int SumOfDigits(int n)
	{
		int s=0;
		while(n!=0)
		{
			int r=n%10;
			s=s+r;
			n=n/10;
		}
		return s;
	}
}
