import java.util.Scanner;
public class SumOfOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int n=s.nextInt();
		int z=sumOfOddDigit(n);
		System.out.println("sum of odd digit "+z);
	}
	static int sumOfOddDigit(int n)
	{
		int count=0;
		int sum=0;
		while(n!=0)
		{
			count++;
			int r=n%10;
			if(count%2!=0)
			{
				sum=sum+count;
				
			}
			n=n/10;
		}
		return sum;
	}

}
