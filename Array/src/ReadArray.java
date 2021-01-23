import java.util.Scanner;

public class ReadArray {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no");
	int n=s.nextInt();
	int ar[]=new int[n];
	System.out.println("enter the element");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=s.nextInt();
	}
	
}
void dispArray(int ar[])
{
	for(int i=0;i<ar.length;i++)
	{
	System.out.println(ar[i]);
	}
	System.out.println();
}
}
