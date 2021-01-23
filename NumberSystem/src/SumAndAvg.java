import java.util.Scanner;
public class SumAndAvg {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println(" Enter the no ");
int y=sc.nextInt();
int i=1;
int sum=0;
double avg=gettingAverage(y);
System.out.println(avg);
while(i<=y)
{
	sum=sum+i;
	i++;}

System.out.println(sum);
	}

	private static double gettingAverage(int n) {
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
	return sum/n;
	}

}
