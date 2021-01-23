import java.util.Scanner;

public class DeseriumNumber {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int n=sc.nextInt();
boolean rs=isDeserium(n);
if(rs){
	System.out.println("no is deserium");
}
else{
	System.out.println("not deserium");
}
	}

	private static boolean isDeserium(int n) {
int sum=0;
int t=n;
int dc=countDigit(n);
while(n!=0)
{
	int r=n%10;
	sum=sum+power(r,dc);
	n=n/10;
	dc--;
}
return sum==t;
	}
	public static int countDigit(int n)
	{
		int count=0;
		do
		{
			n=n/10;
			count++;
		}while(n!=0);
		return count;
	}
public static int power(int n,int p)
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
