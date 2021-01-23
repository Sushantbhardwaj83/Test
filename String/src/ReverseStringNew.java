
public class ReverseStringNew {

	public static void main(String[] args) {
String st="they play football";
char ch[]=st.toCharArray();
String newst="";

for(int i=ch.length-1;i>=0;i--)	
{
	newst=newst+ch[i];
}
System.out.println(newst);
	}
}
