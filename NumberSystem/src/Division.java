import java.util.Scanner;

public class Division {

public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter two no.");
double x=s.nextDouble();
double y = s.nextDouble();
double z=divide(x,y);
System.out.println(z);
	}
	public static double divide(double x,double y)
	{
		double c=0;
		double result=0;
		c=x+y;
		while(c>y)
		{
			c=c-y;
			result++;
		}
		
		return result;
	}
	
	
}
