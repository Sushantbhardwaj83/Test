import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("enter the   value ");
int n=s.nextInt();
	int count =0;
	for(int  i=2;i<=n;i++)
	{
		if(i%2==0)
		{
			count =count+1;
			System.out.println("even no is"+i);
		}
	}
	
	System.out.println("count of even no is"+count);
	
	}

}
