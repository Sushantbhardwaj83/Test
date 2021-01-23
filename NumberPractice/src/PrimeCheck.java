import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		int j;
		if(n==1){
			System.out.println("enter no above 2");
		}
		for( j=2;j<n;j++)
		{
			if(n%j==0)
				System.out.println("not prime");
			else 
				System.out.println("prime");
			break;
		}
	}

}
