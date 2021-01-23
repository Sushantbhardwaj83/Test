import java.util.Scanner;

public class HowManyStrongNumber {


	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
int y=factorialNumber(n);
int rs=isStrong(n);
System.out.println(rs);
	}
	private static int isStrong(int no) {
		int fact=factorialNumber(no);
		int sum=0;
		int z=no;
		int count=0;
		while(no!=0)
		{
			int y=no%10;
			sum=sum+factorialNumber(y);
			no=no/10;
			count++;
		}
		return count;
	}
	static int factorialNumber(int x)
	{
		int fc=1;
		{
			fc=fc*x;
			x--;
		}
		return fc;
	}
}
