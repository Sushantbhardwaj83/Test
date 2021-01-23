
public class ReplaceWhitespace {

	public static void main(String[] args) {
String str="   geeks for geeks";
	char ch[]=str.toCharArray();
	String st="";
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]!=' ')
		{
			st=st+ch[i];
		}
	}
	System.out.println(st);
	}

}
