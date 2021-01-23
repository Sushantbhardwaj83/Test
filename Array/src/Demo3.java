import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
System.out.println("enter the size of an array");
int n=s.nextInt();
int a[]=new int [n];
System.out.println("enter the elements of array");
int i,j,temp;
for( i=0;i<a.length;i++)
{
	a[i]=s.nextInt();
}

System.out.print("Now the Reverse of Array is : \n");
for(i=a.length-1; i>=0; i--)
{
	
    System.out.print(a[i]+ "  ");
}       
}
}
