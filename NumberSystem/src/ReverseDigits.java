import java.util.Scanner;
public class ReverseDigits {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the no");
		int n=scn.nextInt();
		int rev=reverseNumber(n);
		System.out.println("reverse of number is"+rev);
		
	}
static int reverseNumber(int n)
{
	int rev=0;
	while(n!=0)
	{
		int r=n%10;
		rev=rev*10+r;
		n=n/10;
	}
	return rev;
	}
}

