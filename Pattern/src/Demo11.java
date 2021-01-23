import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
int sp=n/2;
int st=1;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=sp;j++)
	{
		System.out.print(" ");
		
	}
	int k=st/2+1;
	  k=1;
	for(int j=1;j<=st;j++)
	{
		System.out.print(k+"");
		if(j<=st/2)
			k++;
		else k--;
	}
	System.out.println();
	if(i<n/2)
	{
		sp=sp-1;
		st=st+2;
	}
	else{
		sp=sp+1;
		st=st-2;
	}
}
	}

}
