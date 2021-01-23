import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			boolean ar=isArmstrong(i);
			if(ar)
				System.out.println(i);
		}
		System.out.println("is armstrong no");
	}
	public static boolean isArmstrong(int n) {
		int count =noofDigit(n);
		int x=n;int sum=0;
		while(n!=0)
		{
			int r=n%10;//153
			sum=sum+pow(r,count);
			n=n/10;
		}
		return sum==x;
	}

	public static int pow(int r, int p) {
		int pw=1;
		while(p>0){
			pw=pw*r;
			p--;
		}
		return pw;
	}
	public static int noofDigit(int n){
		int c=0;
		int i=0;
		while(n!=0){
			i++;
			n=n/10;
		}return i;
	}

}
