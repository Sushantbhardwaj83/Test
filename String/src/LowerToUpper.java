import java.util.Scanner;

public class LowerToUpper {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String s1=s.nextLine();
		String st="";
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if	((ch[i]>=97&&ch[i]<=122) )
			{ 
				ch[i]=(char)(ch[i]-32);
				System.out.println(ch);
			}
		}
	System.out.println(ch);
		st=new String(ch);
	System.out.println(st);
	}

}
