import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n-i;k++)
			{
			System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{			
			System.out.print("*");
		    }
		System.out.println();
	}} 
	}
