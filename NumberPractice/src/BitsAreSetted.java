import java.util.Scanner;

public class BitsAreSetted {
public static void main(String[] args) {
	Scanner sc=new  Scanner(System.in);
	System.out.println("enter the no");
	int n=sc.nextInt();
	int rs=countBits(n);
		System.out.println(rs);
}
public static int countBits(int no)
{
	int count=0;
	while(no!=0)
	{
		int r=no%2;
		if(r==1)
		{
			count++;
		}
		no=no/2;
	}
	return count;
}
}
