import java.util.Scanner;

public class DecToHexaDecimal {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int n=sc.nextInt();
String rs=decToHex(n);
System.out.println(rs);
}
static String decToHex(int n)
{
	String hex=" ";
	while(n!=0)
	{
		int r=n%16;
		if(r<10)
		{
			hex=r+hex;
		}
		else
		{
			hex=(char)(r+55)+hex;
		}
		n=n/16;
	}
	return hex;
}
	
}
