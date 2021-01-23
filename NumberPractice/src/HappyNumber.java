import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int n=sc.nextInt();
boolean rs=isHappy(n);
if(rs)
	System.out.println("no is happy");
else
	System.out.println("not happy");

	}
	public static boolean isHappy(int n)
	{
		while(n>9)
		{
			n=sumOfDigit(n);
		}
		return n==1||n==7;
	}
private static int sumOfDigit(int n) {
int sum=0;
while(n!=0)
{
	int r=n%10;
	sum=sum+r*r;
	n=n/10;
}
return sum;
	}

}
