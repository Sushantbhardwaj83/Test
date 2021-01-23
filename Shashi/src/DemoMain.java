
public class DemoMain {

	public static void main(String[] args) {
		String s="12345";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48&&ch[i]<=57)
			{
				System.out.println(ch[i]+"is alphabet");
			}
		}
	
	
		
	}

}
