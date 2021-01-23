import java.util.Scanner;

public class Fabonnaci {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
int a=1;
int b=1;
int k=0;
System.out.print("0  1 1");
while(k<=n){
	k=a+b;
	if(k>=n){
		break;
	}
	System.out.print(  "  "+ k+ " ");
	a=b;
	b=k;
}
	}

}
