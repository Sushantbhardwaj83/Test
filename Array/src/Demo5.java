import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no of elements in array");
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<a.length;i++)
{
	a[i]=s.nextInt();
	System.out.println(i+"---"+a[i]);
}

	}

}
