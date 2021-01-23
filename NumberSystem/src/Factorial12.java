import java.util.Scanner;

public class Factorial12 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int x=s.nextInt();
int z=fact(x);
System.out.println(z);
	}

	public static int fact(int x) {
		int c=1;
		while(x!=0){
			c=c*x;
			x--;
		}
		return c;
	}

}
