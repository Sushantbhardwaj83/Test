
public class ReplaceSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String st="this is my new car";
String str[]=st.split(" ");
String stn="";
for(int i=0;i<str.length;i++)
{
	if(str[i].matches("new"))
     str[i]="bike";
	stn=stn+str[i]+" ";
}
System.out.println(stn);
	}
	

}
