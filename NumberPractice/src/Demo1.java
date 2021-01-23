import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
int sum=0;
for(int i=0;i<=n;i++)
{   boolean isPrime=true;
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			isPrime=false;
			break;
		}
	}

if(isPrime)
System.out.println(i+"");
}	}

}
