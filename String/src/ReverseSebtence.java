
public class ReverseSebtence {

	public static void main(String[] args) {
		String st="they play football";
		char ch[]=st.toCharArray();
		String nstr="";
		for(int i=ch.length-1;i>=0;i--){
			int k=i;
			while(i>=0&&ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while(j<=k)
			{
				nstr=nstr+ch[j];
				j++;
			}
			nstr=nstr+" ";
		}
		System.out.println(nstr);
	}

}
