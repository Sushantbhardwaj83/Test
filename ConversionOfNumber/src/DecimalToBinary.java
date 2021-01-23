import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the decimal no");
int n=sc.nextInt();
String rs=decToBin(n);
System.out.println(rs);
	}
	static String decToBin(int n)
	{
		String bin=" ";
		while(n!=0)
		{
			int r=n%2;
			bin=r+bin;
			n=n/2;
		}
		return bin;
		
	}

}
