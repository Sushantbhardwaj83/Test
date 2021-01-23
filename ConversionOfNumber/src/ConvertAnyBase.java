import java.util.Scanner;
public class ConvertAnyBase {

	public static void main(String[] args) {
		Scanner s=new  Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int m=s.nextInt();
		String r=convertbase(n,m);
		System.out.println(r);
	}
static String convertbase(int n,int b){
	String hex="";
	while(n!=0)
	{
		int r=n%b;
		if(r<10)
			hex=r+hex;
		else 
			hex=(char)(r+55)+hex;
		n=n/b;
		
	}
	return hex;
}
}
