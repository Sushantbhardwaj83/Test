import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter the no");
		int n=scn.nextInt();
		int count=0;
		for (int i=1;i<=n;i++){
			if(i%3==0)
			{
				if(i%5==0)
					count =count+1;
					System.out.println(i);
			}
		}
		System.out.println("count:"+count);
	}

}
