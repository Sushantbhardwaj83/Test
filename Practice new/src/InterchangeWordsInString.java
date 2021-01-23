import java.util.Scanner;

public class InterchangeWordsInString {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String st=s.nextLine();
String strn[]=breakIt(st,' ');
for(int i=1;i+2<strn.length;i=i+4)
{
	String t=strn[i];
	strn[i]=strn[i+2];
	strn[i+2]=t;
}
String res=" ";
for(int i=0;i<strn.length;i++)
{
	res=res+strn[i]+" ";
}
System.out.println(res);
	}
static String[] breakIt(String st,char c)
{
	char ch[]=st.toCharArray();
	int count=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]==c)
			count++;
	}
	String strnw[]=new String[count+1];
	int k=0;
	strnw[k]=" ";
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]!=c)
			strnw[k]=strnw[k]+ch[i];
		else{
			k++;
			strnw[k]="";
		}
		return strnw;
	}
}
}
