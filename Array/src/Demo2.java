import java.util.Scanner;

public class Demo2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter the size of array");
	int n=s.nextInt();
	int a[]=new int[n];
	System.out.println("enter the elements");
for(int i=0;i<a.length;i++)
{
	a[i]=s.nextInt();
	
}
System.out.println("largest is");
for(int i=0;i<a.length;i++)
{
	if(a[0]<a[i]){
		a[0]=a[i];
	}
}
System.out.println(a[0]);
}
}
