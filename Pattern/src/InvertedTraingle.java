import java.util.Scanner;

public class InvertedTraingle {

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		for (int i=n;i>=1;i--) 
		{ 
			for (int j=0;j<n-i;j++)
			{
				System.out.print(' ');
			}
			for (int j=(2-i);j<(2-i)+(2*i-1);j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

