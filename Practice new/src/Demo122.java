import java.util.Scanner;

public class Demo122 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string");
	String str=s.nextLine();
	String strn=extract(str);
	System.out.println(strn);
}
static String extract(String str)
{
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length/2;i++)
	{
		for(int j=ch.length-1;j>ch.length/2;j--)
		{
			if(ch[i]!=ch[j]){
				System.out.println("not matched");
			    i++;
			    j--;
				break;
			     
			}else
				System.out.println(ch[i]);
		}
		
	}
	return str;
}

}
