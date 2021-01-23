import java.util.Scanner;
public class CountInteger {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the no");
		int n=scn.nextInt();
		int c=numberOfDigits(n);
		System.out.println("number of digits in"+n+"is"+c);
	}
static int numberOfDigits(int x)
{
	int count=0;
	do{
		count++;
		x=x/10;
	}
	while(x!=0);


return count;
	}
}
	

