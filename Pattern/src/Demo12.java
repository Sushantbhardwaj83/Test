import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the value of n");
		char ch;
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{     ch='a';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
}
