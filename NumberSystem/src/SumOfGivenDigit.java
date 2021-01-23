import java.util.Scanner;
public class SumOfGivenDigit {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no");
	int n=s.nextInt();
	int sum=SumOfDigit(n);
	System.out.println(sum);
}
static int SumOfDigit(int n)
{
 int x=0;
	while(n!=0)
	{
		int y=n%10;
		x=x+y;
		n=n/10;
		
	}
	return x;
	
}
}
