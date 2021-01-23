import java.util.Scanner;

public class WiproProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		for(int i=1;i<=n;i=i+10)
		{  int j;
			for( j=1;j<=5;j++)
			{			
		if(j<n){
			System.out.print(j);
			System.out.print("*");}
		else System.out.print(j);
			
			}
			j=j+10;
			System.out.println();
		}
		System.out.println();
		
	}

}
