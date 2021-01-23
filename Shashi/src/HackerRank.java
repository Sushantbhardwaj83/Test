import java.util.Scanner;

public class HackerRank {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
int  ar[]=new int[]{2,3,4,6};
diff(n,ar);
	}
public static void diff(int n,int[] ar)
{   int nw[]=new int [ar.length];
	
	for(int i=0;i<ar.length;i++)
	{
		nw[i]=n-ar[i];
		System.out.print(nw[i] +" ");
	}
	
}
	
}
