import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the no");
		int n=scn.nextInt();
		int sum=0;
		int i=1;
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
