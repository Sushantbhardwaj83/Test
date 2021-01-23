
public class SentenceReverse {

	public static void main(String[] args) {
String st="they play football";
char ch[]=st.toCharArray();
String nstr="";
for(int i=0;i<=ch.length-1;i++)
{
	int k=i;
	while(i<ch.length&&ch[i]!=' ')
	{
		i++;
	}
	int j=i-1;
	while(j>=k){
		nstr=nstr+ch[j];
		j--;
	}
	nstr=nstr+" ";
}
System.out.println(nstr);
	}

}
