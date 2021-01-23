import java.util.Scanner;

public class EmailValidationProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the email");
		String email=s.nextLine();
		boolean rs=emailValidation(email);
		if(rs)
			System.out.println(true+"      "+"email is valid");
		else
			System.out.println(false+"     "+"email is not valid");
	}


	public static boolean emailsmallletter(String email)
	{
		char ch[]=email.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65&&ch[i]<=90)
				return false;
		}
		return true;
	}
	public static boolean checkdot(String email)
	{
		String st=".com";
		char chr[]=st.toCharArray();
		char ch[]=email.toCharArray();
		for(int i=ch.length-4;i<ch.length;i++)
		{
			for(int j=0;j<chr.length;j++){
				if(ch[i]!=chr[j])
					return false;
			}
		}
		return true;
	}
	public static boolean checkattherate(String email)
	{
		char ch[]=email.toCharArray();
		for(int i=0;i<ch.length-4;i++)
		{
			if(ch[i]!='@')
				return false;
		}
		return true;
	}
	public static boolean emailValidation(String email)
	{
		if(checkattherate(email)!=true
				&&emailsmallletter(email)!=true
				&&checkdot(email)!=true)
			return false;
		else
			return true;
	}
}
