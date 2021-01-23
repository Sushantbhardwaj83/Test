
public class SumOfValue {

	public static void main(String[] args) {
int ar[]={2,4,6,8,10};
int sum=0;
int average=0;
for(int i=0;i<=ar.length-1;i++)
{
	sum=sum+ar[i];
	 average=sum/(i+1);
}
System.out.println(average);
System.out.println(sum);
	}

}
