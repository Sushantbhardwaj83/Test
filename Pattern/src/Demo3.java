import java.util.Scanner;

public class Demo3 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no");
	int n=s.nextInt();
	int i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i+1;j++)
		{
			System.out.print("*");
	}
	System.out.println("");
}
}

}

