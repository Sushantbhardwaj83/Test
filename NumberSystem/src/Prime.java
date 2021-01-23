import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int x=s.nextInt();
primeno(x);

}

	public static void primeno(int x) 
	{
		String s="";
		int i=0,j=0;
		for( i=1;i<=x;i++)
		{
			int c=0;
			for( j=x;j>1;j--)
			{
				
				if(i%j==0)
				{
					c++;
				}
			}
				if(c==2)
				{
			
		      s=s+i+" ";
				}
			
			
		}
		System.out.println(s);
		
	}
	}

