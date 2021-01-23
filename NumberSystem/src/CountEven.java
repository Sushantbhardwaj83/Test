import java.util.Scanner;
public class CountEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int n=s.nextInt();
		int z=evenInNumber(n);
		System.out.println("no of even digit"+z);
		
	}
	static int evenInNumber(int n)
	{
		int count=0;
		while(n!=0)
		{
			int r=n%10;
			if(r%2==0)
			{
				count++;
			}
			n=n/10;
		}
		return count;
	}
}
