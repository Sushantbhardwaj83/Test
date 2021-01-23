import java.util.Scanner;

public class InitCapStartLetter {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the sentence");
String st=s.nextLine();
char ch[]=st.toCharArray();
String res="";
for(int i=0;i<ch.length;i++)
{
	if(i==0||ch[i-1]==' ')
	{
		if(ch[i]>=97&&ch[i]<=122)
		
			res=res+(char)(ch[i]-32);
			else res=res+ch[i];
	}
	else if(ch[i]>=65&&ch[i]<=90)
		res=res+(char)(ch[i]+32);
	else
		res=res+ch[i];
}
System.out.println(res);
	}

}
