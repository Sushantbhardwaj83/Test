import java.util.Scanner;

public class Demo13 {

	public static void main(String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("enter the value of n");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(i);
	}
	System.out.println();
}
	}

}
