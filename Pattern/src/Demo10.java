import java.util.Scanner;

public class Demo10 {

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
	for(j=1;j<=2*i-1;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
	}

}
