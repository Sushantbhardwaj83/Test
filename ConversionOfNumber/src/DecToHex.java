import java.util.Scanner;
public class DecToHex {

	public static void main(String[] args) {
		Scanner s=new  Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	String r=decToHex(n);
	System.out.println(r);
	}
static String decToHex(int n){
	String hex="";
	while(n!=0)
	{
		int r=n%16;
		if(r<10)
			hex=r+hex;
		else
			hex=(char)(r+55)+hex;
		n=n/16;
	}
	return hex;
}
}
