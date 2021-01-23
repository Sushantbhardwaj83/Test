import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
int no=0;
int temp=n;
while(n>0)
{
	int r=n%10;
	no=(no*10)+r;
	n=n/10;
}
if(temp==no){
	System.out.println("no is palindrome");
}else
	System.out.println("not palindrome");
	}

}
