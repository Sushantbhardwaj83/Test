import java.util.Scanner;
public class CheckAnagram {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String s1=s.nextLine();
		String rs=removeSpaces(s1);
		System.out.println(rs);
	}
	static	String	removeSpaces(String	str)
	{ 
		char []ch=str.toCharArray	();
		
		String	nstr=" ";
		for(int	i=0;i<ch.length;i++)
		{ 
			if(ch[i]!=' ')
				nstr=nstr +ch[i];
		} 
		return	nstr;
	}
	static	String	toLowerCase(String	str)
	{
		char[]	ch=str.toCharArray();
		String	nstr=" ";
		for(int	i=0;i<ch.length;i++)
		{ 
			if(ch[i]>=65 &&	ch[i]<=90)
			{
				nstr=nstr+((char)ch[i]+32);
			} 
			else 
			{
				nstr=nstr +ch[i];
			}
		} return	nstr;
	} static	String	sort(String	str) 
	{
		char[]	ch=str.toCharArray();
		for(int	i=0;i<ch.length-1;i++)
		{
			for(int	j=i+1;j<ch.length;j++) 
			{
				if(ch[i]>ch[j]) 
				{
					char t=ch[i];
					ch[i]=ch[j];
					ch[j]=t;
				}
			}
		}
		String	st=new	String(ch);
		return	st;
	}
	static	boolean	compare(String	s1,	String	s2)
	{
		if(s1.length()!=s2.length())
			return	false;
		else 
		{
			s1=toLowerCase(s1);
			s2=toLowerCase(s2); 
			s1=sort(s1);
			s2=sort(s2);
			char	ch1[]=s1.toCharArray();
			char	ch2[]=s2.toCharArray();
			for(int	i=0;i<ch1.length;i++) 
			{
				if	(ch1[i]!=ch2[i]) 
				{
					return	false; 
				}
			} return	true;
		}
	}

}