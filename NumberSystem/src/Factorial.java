import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
int f=factorialNumber(n);
System.out.println(f);
	}
static int factorialNumber(int x)
{
	int fc=1;
	while(x>1)
	{
		fc=fc*x;
		x--;
	}
	return fc;
}
}
