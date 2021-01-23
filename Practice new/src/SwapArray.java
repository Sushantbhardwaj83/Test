
public class SwapArray {

	public static void main(String[] args) {
int ar[]={2,3,4,5,6,7,8};
int n=ar.length;
int temp;
for(int i=0;i<ar.length/2;i++)
{
	temp=ar[i];
	ar[i]=ar[n-n/2+i];
	ar[n-n/2+i]=temp;
}
System.out.println("after swap");
for(int i=0;i<ar.length;i++)
	System.out.print(ar[i]);
	}

}
