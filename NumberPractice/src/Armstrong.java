import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your number");
	int n=sc.nextInt();
	boolean rs=isArmsttong(n);
	if(rs)
	{
		System.out.println("number will armstrong");
	}
	else
	{
		System.out.println("number will not armstrong");
	}
	
}

private static boolean isArmsttong(int n)
{
	int sum=0;
	int t=n;
	int dc=numberOfDigit(n);
	do
	{
		int r=n%10;
		sum=sum+pow(r,dc);
		n=n/10;
	}while(n!=0);
	return sum==t;
	
}
static int numberOfDigit(int n)
{
	int count=0;
	do
	{
		n=n/10;
		count++;
	}while(n!=0);
	return count;
}
static int pow(int n,int p)
{
	int pw=1;
	while(p>0)
	{
		pw=pw*n;
		p--;
	}
	return pw;
}
}
