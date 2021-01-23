import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("enter length of array");
int a=s.nextInt();
System.out.println("enter the elements");
int ar[]=new int[a];
for(int i=0;i<ar.length;i++)
{
	ar[i]=s.nextInt();
	System.out.println	("ar ["+i+"]---->"+ar[i]);
	
}
System.out.println("reverse of an array");
for(int i=0;i<ar.length/2;i++)
{
	int b=ar[i];
	ar[i]=ar[ar.length-1-i];
	ar[ar.length-1-i]=b;
	
}
for(int i=0;i<ar.length;i++)
{
	System.out.println(ar[i]);
}

	}

}
