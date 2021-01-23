import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no");
int n=s.nextInt();
int	count=noOfDigits(n);
System.out.println(count);	
	}

	private static int noOfDigits(int n) {
int count=0;
do{
	n=n/10;
	count++;
	
}while(n!=0);
return count;
	
	}

}
