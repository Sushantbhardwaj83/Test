import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String st=s.nextLine();
String stn=removeSpaces(st);
System.out.println(stn);
	}
	static	String	removeSpaces(String	st)
	{
		char[] ch=st.toCharArray();
	String	nstr=" ";
	for(int	i=0;i<ch.length;i++) 
	{ 
		if(ch[i]!=' ') 
		nstr=nstr+ch[i];
	}
	return	nstr;
	}
}
