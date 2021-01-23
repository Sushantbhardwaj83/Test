import java.util.*;

public class RemoveVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.next();
		remove(s);
	}
	static void remove(String s)
	{
		String s1=s.toUpperCase();
		char ch[]=s1.toCharArray();
		String st="";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
			{
				st=st+ch[i];
			}
		}
		System.out.println("vowerl of string is"+st);
		
	}

}
