import java.util.Scanner;

public class Perfectnumber12 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int x=s.nextInt();
		boolean b=checkperf(x);
		if(b)
			System.out.println("perfect");
		else
			System.out.println("not perfect");
		
	}

	public static boolean checkperf(int x) {
	int	sum=0;
     for(int i=1;i<=x/2;i++){
    	 if(x%i==0){
    		 sum=sum+i;
    	 }
     }return sum==x;

	}

}
