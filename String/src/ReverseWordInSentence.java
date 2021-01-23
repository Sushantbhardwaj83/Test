import java.util.Scanner;

public class ReverseWordInSentence {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String st=s.nextLine();
System.out.println(reverseWord(st));
	}
	static String reverseWord(String st)
	{
		char ch[]=st.toCharArray();
		String rs=" ";
		for(int i=0;i<ch.length;i++)
		{
			int j=i;
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int k=i-1;
			while(j<=k)
			{
				rs=rs+ch[k];
				k--;
			}
			if(i<ch.length)
			st=st+ch[i];
		}
		return rs;
	}

}
