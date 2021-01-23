import java.util.Scanner;
public class AverageOfDigits {

	public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("enter the value");
 int n=s.nextInt();
 double avg=avgDigits(n);
 System.out.println("average of digits"+avg);
 }
static double avgDigits(int n)
{
	int sum=0;
   int count=0;
   while(n!=0)
   {
	   count++;
	   int r=n%10;
	   sum=sum+r;
	   n=n/10;
   }
   return sum/count;
}
	
}
