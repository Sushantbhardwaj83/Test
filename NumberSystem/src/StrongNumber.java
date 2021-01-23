import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int n=s.nextInt();
int y=factorialNumber(n);
boolean rs=isStrong(n);
if(rs)
	{System.out.println("strong number");
System.out.println(n);}
else
	System.out.println("is not strong number");
	}

	private static boolean isStrong(int no) {
		int fact=factorialNumber(no);
		int sum=0;
		int z=no;
		while(no!=0)
		{
			int y=no%10;
			sum=sum+factorialNumber(y);
			no=no/10;
			
		}
		return sum==z;
	}
	static int factorialNumber(int x)
	{
		int fc=1;
		while(x>1)
		{
			fc=fc*x;
			x--;
		}
		return fc;
	}
}
